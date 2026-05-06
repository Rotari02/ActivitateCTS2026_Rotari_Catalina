package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Command;
import ro.ase.cts.clase.Operator;
import ro.ase.cts.clase.Plecare;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        Command comandaVolvo = new Plecare(new Autobuz("Volvo"),235);
        Command comandaBMW = new Plecare(new Autobuz("BMW"),105);

        operator.adaugaComanda(comandaVolvo);
        operator.adaugaComanda(comandaBMW);
        operator.adaugaComanda(new Plecare(new Autobuz("Mercedes"),200));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
