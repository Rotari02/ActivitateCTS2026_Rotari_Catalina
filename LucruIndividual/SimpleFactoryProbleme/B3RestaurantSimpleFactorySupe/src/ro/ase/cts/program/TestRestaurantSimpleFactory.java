package ro.ase.cts.program;

import ro.ase.cts.clase.ASupa;
import ro.ase.cts.fabrica.SupaFactory;
import ro.ase.cts.fabrica.TipSupa;

public class TestRestaurantSimpleFactory {
    public static void main(String[] args) {
        //creare fabrica supe
        SupaFactory fabrica= new SupaFactory();

        //creare diferite tipuri de supe
        ASupa supa=fabrica.creareSupa(TipSupa.LEGUME,"Supa de post");
        ASupa supa1=fabrica.creareSupa(TipSupa.CIUPERCI, "Supa crema de trufe");
        ASupa supa2=fabrica.creareSupa(TipSupa.VITA, "Ciorba de vacuta");

        //afisare rezultate
        supa.afisareDetalii();
        supa1.afisareDetalii();
        supa2.afisareDetalii();


        System.out.println("\nTip obiect 1: " + supa.getTip());
        System.out.println("Tip obiect 2: " + supa1.getTip());
        System.out.println("Tip obiect 3: " + supa2.getTip());

    }
}
