package ro.ase.cts.program;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareBuilder;

public class Main1 {
    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder("Catalina");
        Rezervare rezervare1 =builder.setScauneErgonomice(true).setGenMuzica("Jazz").build();
        Rezervare rezervare2 = builder.setGenMuzica("Pop").build();
        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }
}
