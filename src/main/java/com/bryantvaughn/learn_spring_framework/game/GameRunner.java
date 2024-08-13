package com.bryantvaughn.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    @Autowired
    @Qualifier("SuperContraGameQualifier")
    GamingConsole gamingConsole;

    public GameRunner(GamingConsole game) {
        this.gamingConsole = game;
    }

    public void run() {
        System.out.println(STR."Running game: \{gamingConsole}");
        gamingConsole.up();
        gamingConsole.down();
        gamingConsole.left();
        gamingConsole.right();
    }
}
