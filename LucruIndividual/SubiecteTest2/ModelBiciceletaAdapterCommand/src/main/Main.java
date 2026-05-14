package main;

import Command.CommandRezervare;
import Command.CommandVanzare;
import Command.Operator;
import Command.PachetCroaziera;
import adapterDeObiecte.AdapterBicicleta;
import adapterDeObiecte.BicicleteElectrica;
import adapterDeObiecte.IPachetTuristic;
import adapterDeObiecte.PachetExcursie;

public class Main {
    public static void afisarePachet(IPachetTuristic pachetTuristic){
        pachetTuristic.descrierePachet();
    }
    public static void main(String[] args) {
        System.out.println("===============pachet turistic===================");

        IPachetTuristic excursie=new PachetExcursie("Grecia");

        IPachetTuristic croaziera=new PachetCroaziera("BLackSeaCruize");

        IPachetTuristic bicicleta =new AdapterBicicleta(new BicicleteElectrica("Bike2355"));

        Operator operator=new Operator();

        System.out.println("=====Rezervari==");

        operator.invoca(new CommandRezervare(excursie));
        operator.invoca(new CommandRezervare(croaziera));
        operator.invoca(new CommandRezervare(bicicleta));

        System.out.println();
        System.out.println("====VANZARI=======");
        operator.invoca(new CommandVanzare(excursie));
        operator.invoca(new CommandVanzare(croaziera));
        operator.invoca(new CommandVanzare(bicicleta));






    }
}
