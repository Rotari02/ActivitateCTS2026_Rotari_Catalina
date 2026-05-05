package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachet1=new PachetCazare(15);
        PachetTuristic pachet2=new PachetTransport(10);

        Operator operator=new Operator();

        Command vanzare=new ComandaVanzare(pachet1);
        Command rezervare=new ComandaRezervare(pachet2);

        operator.invoca(rezervare);
        operator.invoca(vanzare);
    }
}
