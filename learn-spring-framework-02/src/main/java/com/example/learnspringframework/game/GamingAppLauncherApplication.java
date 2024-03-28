package com.example.learnspringframework.game;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.example.learnspringframework.game")
public class GamingAppLauncherApplication {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
