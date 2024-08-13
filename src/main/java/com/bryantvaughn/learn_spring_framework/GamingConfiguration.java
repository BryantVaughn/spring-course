package com.bryantvaughn.learn_spring_framework;

import com.bryantvaughn.learn_spring_framework.game.GamingConsole;
import com.bryantvaughn.learn_spring_framework.game.PacManGame;
import com.bryantvaughn.learn_spring_framework.game.GameRunner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        return new PacManGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
}
