package com.example.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {

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
}
