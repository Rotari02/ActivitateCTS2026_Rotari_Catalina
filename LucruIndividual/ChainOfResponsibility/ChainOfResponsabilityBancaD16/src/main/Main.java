package main;

import clase.ContCredit;
import clase.ContDebit;
import clase.ContEconomii;
import clase.HandlerPlata;

public class Main {
    public static void main(String[] args) {
        HandlerPlata contDebit = new ContDebit(100);
        HandlerPlata contEconomii = new ContEconomii(200);
        HandlerPlata contCredit = new ContCredit(500);

        contDebit.setSuccesor(contEconomii);
        contEconomii.setSuccesor(contCredit);

        contDebit.gestioneazaPlata(90);
        System.out.println();
        contDebit.gestioneazaPlata(100);
        System.out.println();
        contDebit.gestioneazaPlata(300);
        System.out.println();
        contDebit.gestioneazaPlata(1000);


    }
}
