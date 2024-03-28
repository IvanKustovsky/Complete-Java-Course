package com.example.learnspringframework.game;

public class GameRunner {
    //private MarioGame game;
    private SuperContraGame game;
    public GameRunner(SuperContraGame superContraGame) {
        this.game = superContraGame;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
