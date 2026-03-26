package ro.ase.cts.program;

import ro.ase.cts.clase.Analist;
import ro.ase.cts.clase.IAngajat;
import ro.ase.cts.fabrici.AngajatFactory;
import ro.ase.cts.fabrici.TipAngajat;

import java.sql.SQLOutput;

public class TestSimpleFactoryAngajat {
    public static void main(String[] args) {
        //creare fabrica pentru angajati
        AngajatFactory fabrica= new AngajatFactory();
        //creare angajat de tip vamnzator
        IAngajat angajat1 = fabrica.creareAngajat(TipAngajat.VANZATOR, "Mihai Petre");
        //creare angajat de tip manager
        IAngajat angajat2= fabrica.creareAngajat(TipAngajat.MANAGER,"Petrescu Pavel");
        //creare angajat de tip analist
        IAngajat angajat3=fabrica.creareAngajat(TipAngajat.ANALIST,"Miron Ana");

        System.out.println("Angajat de tip: "+angajat1.getTip());
        System.out.println("Angajat de tip; "+angajat2.getTip());
        System.out.println("Angajat de tip: "+angajat3.getTip());
    }

}
