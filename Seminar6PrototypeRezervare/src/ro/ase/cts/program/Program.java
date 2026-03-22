package ro.ase.cts.program;

import ro.ase.cts.clase.PrototypeRezervare;
import ro.ase.cts.clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        PrototypeRezervare rezervare = new Rezervare("Catalina", 3, "12:00", "08765432653");
        PrototypeRezervare rezervare2 = rezervare.copiaza();
        ((Rezervare) rezervare2).setNrPersoane(4);
        ((Rezervare) rezervare2).setOra("16:00");

        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
    }
}