package ro.ase.cts.main;

import ro.ase.cts.clase.ARezervare;
import ro.ase.cts.clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare("Catalina", 4, "18.03.2026", "19:30");
        ARezervare rezervare2 = rezervare.copiaza();
        ARezervare rezervare3 = rezervare.copiaza();

        rezervare2.setNrPersoane(2);
        rezervare2.setData("20.03.2026");
        rezervare2.setOra("18:00");

        rezervare3.setNrPersoane(7);
        rezervare3.setData("14.04.2026");
        rezervare3.setOra("17:30");

        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
        System.out.println(rezervare3.toString());
    }
}
