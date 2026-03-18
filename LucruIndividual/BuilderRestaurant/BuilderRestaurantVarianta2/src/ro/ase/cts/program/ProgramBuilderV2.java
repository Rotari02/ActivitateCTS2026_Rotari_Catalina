package ro.ase.cts.program;

import org.w3c.dom.ls.LSOutput;
import ro.ase.cts.clase.RezervareBuilderV2;
import ro.ase.cts.clase.Rezervare2;

public class ProgramBuilderV2 {
    public static void main(String[] args) {
        RezervareBuilderV2 builder = new RezervareBuilderV2();
        Rezervare2 rezervare =builder.setGenMuzica("Pop").setAsezareGeam(true).build("Catalina");
        Rezervare2 rezervare2 =builder.setScauneErgonomice(true).build("Maria");
        System.out.println(rezervare.toString());
        System.out.printf(rezervare2.toString());
    }


}
