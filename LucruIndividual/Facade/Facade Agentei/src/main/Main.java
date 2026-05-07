package main;

import clase.Facade;

public class Main {
    public static void main(String[] args) {
        Facade programeazaVacanta = new Facade();
        programeazaVacanta.rezervaPachetCazareTransport("Bucuresti", "Constanta");
    }
}
