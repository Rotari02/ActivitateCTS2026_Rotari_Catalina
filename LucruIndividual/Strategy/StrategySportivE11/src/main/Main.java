package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        IVerificareSpectator verificareVip=new VerificareVip();
        IVerificareSpectator verificareTribuna=new VerificareTribune();
        IVerificareSpectator verificarePeluza= new VerificarePeluza();

        Spectator spectator=new Spectator("Ion");
        spectator.setTipVerificare(verificareVip);
        spectator.controlAcces();
        System.out.println();


        spectator.setTipVerificare(verificareTribuna);
        spectator.controlAcces();
        System.out.println();

        spectator.setTipVerificare(verificarePeluza);
        spectator.controlAcces();
        System.out.println();
    }
}
