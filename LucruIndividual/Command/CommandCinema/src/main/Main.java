package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        IClip clip = new Film();
        ICommand comanda = new PlayCommand(clip);
        Player player = new Player();
        player.invoca(comanda);
        player.invoca(comanda);
        player.invoca(comanda);
        System.out.println();

        clip = new VideoClip();
        comanda = new PauseCommand(clip);
        player.invoca(comanda);
        System.out.println();

        clip = new Film();
        comanda = new PlayCommand(clip);
        player.invoca(comanda);
        player.undo();
        player.undo();
        player.undo();
        player.undo();
        player.undo();

    }
}
