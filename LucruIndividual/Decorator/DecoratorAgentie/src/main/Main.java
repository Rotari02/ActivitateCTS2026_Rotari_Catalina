package main;

import clase.PachetCazare;
import clase.PachetTuristic;
import decorator.OfertaPachetCazare;
import decorator.OfertaPachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetTuristic = new PachetCazare();
        pachetTuristic.descriere();
        System.out.println("Acest pachet nu poate fi anulat!");
        System.out.println();

        OfertaPachetTuristic ofertaPachetTuristic = new OfertaPachetCazare(pachetTuristic);
        ofertaPachetTuristic.descriere();
        System.out.println("Acest pachet turistic poate fi anulat!");
        ofertaPachetTuristic.anulareRezervare();
    }
}
