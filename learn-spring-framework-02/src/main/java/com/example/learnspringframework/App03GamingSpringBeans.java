package com.example.learnspringframework;

import com.example.learnspringframework.game.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class App03GamingSpringBeans {
    @Bean
    public GameRunner gameRunner(@Qualifier("marioGame") GamingConsole game) {
        return new GameRunner(game);
    }
    @Bean
    @Primary
    public GamingConsole pacmanGame(){
        return new PacmanGame();
    }

    @Bean
    @Qualifier("marioGame")
    public GamingConsole marioGame(){
        return new MarioGame();
    }

    @Bean
    @Qualifier("superContraGame")
    public GamingConsole superContraGame(){
        return new SuperContraGame();
    }
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
