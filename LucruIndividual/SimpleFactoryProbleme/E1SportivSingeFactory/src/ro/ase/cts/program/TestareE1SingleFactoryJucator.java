package ro.ase.cts.program;

import ro.ase.cts.clase.AJucator;
import ro.ase.cts.fabrici.FabricaJucatori;
import ro.ase.cts.fabrici.TipJucator;

public class TestareE1SingleFactoryJucator {
    public static void main(String[] args) {
        //creare fabrica
        FabricaJucatori fabrica = new FabricaJucatori();
        AJucator portar = fabrica.creeazaJucator(TipJucator.PORTAR,"Marin Georgescu",false,21,9);
        AJucator fundas=fabrica.creeazaJucator(TipJucator.FUNDAS,"Mihail Petrescu", false,9, 5);
        AJucator mijlocas=fabrica.creeazaJucator(TipJucator.MIJLOCAS,"Ion Avramescu",false,3,6);
        AJucator atacant =fabrica.creeazaJucator(TipJucator.ATACANT,"Miron Costea",true,18,20);

        portar.descriereProfilJucator();
        fundas.descriereProfilJucator();;
        mijlocas.descriereProfilJucator();
        atacant.descriereProfilJucator();

    }

}
