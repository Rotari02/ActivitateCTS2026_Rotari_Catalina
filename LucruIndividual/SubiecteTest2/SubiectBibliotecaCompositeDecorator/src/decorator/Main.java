package decorator;

import composite.CartNodFrunza;
import composite.IElementBiblioteca;

public class Main {
    public static void main(String[] args) {
        IElementBiblioteca carte =new CartNodFrunza("Cosmos","Carl S");
        carte.printeazaInformatii();

        System.out.println("aceasta carte nu are itate este simpla");
        System.out.println();

        //decorator
      CitireDecorator carteApa=new TipAoa(carte,"Carl S","Cosmos",1980);
      carteApa.printeazaInformatii();
      carteApa.afisareaCitire();
      System.out.println();

        CitireDecorator carteChicago=new TipChigago(carte, "Sagan, Carl", "Cosmos", "New York", 1980);
        carteChicago.printeazaInformatii();
        System.out.println("Aceasta carte are format de citare Chicago:");
        carteChicago.afisareaCitire();
        System.out.println();

    }
}
