package main;

import clase.PachetCazareTransport;
import clase.PachetTransport;
import clase.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetTransport=new PachetTransport(2);
        pachetTransport.vindePachet();
        System.out.println("\n");

        PachetTuristic pachetCazareTransport=new PachetCazareTransport(4);
        pachetCazareTransport.vindePachet();
    }
}
