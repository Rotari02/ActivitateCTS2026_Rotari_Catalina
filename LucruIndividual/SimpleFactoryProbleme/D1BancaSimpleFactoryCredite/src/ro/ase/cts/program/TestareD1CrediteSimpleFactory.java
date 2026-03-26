package ro.ase.cts.program;

import ro.ase.cts.clase.ACredit;
import ro.ase.cts.fabrici.FabricaCredite;
import ro.ase.cts.fabrici.TipCredit;

public class TestareD1CrediteSimpleFactory {
    public static void main(String[] args) {
        FabricaCredite fabrica = new FabricaCredite();

        ACredit credit1= fabrica.creareCredit(TipCredit.IPOTECAR,"Marin Petrescu");
        ACredit credit2=fabrica.creareCredit(TipCredit.NEVOI_PERSONALE,"Mihaela Pavalache");

        credit1.afisare();
        credit2.afisare();

        System.out.println("\nAcesta credit este de tip: "+credit1.getTip());
        System.out.println("Acesta credit este de tip: "+credit2.getTip());

        //verifica daca este ok getBwneficiar , daca nu da ca parametru in afisare(String beneficiar) si la main vei adauga tu manual beneficiarul);
    }
}
