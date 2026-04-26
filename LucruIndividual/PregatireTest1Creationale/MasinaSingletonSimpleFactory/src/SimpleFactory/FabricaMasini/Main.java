package SimpleFactory.FabricaMasini;

import SimpleFactory.clase.AMasina;

public class Main {
    public static void main(String[] args) {
        FabricaMasina fabrica =new FabricaMasina();
        AMasina masina1= fabrica.creeazaMasina(TipMasina.SEDAN,"A123FGJ","HFGH",23456.00);
    }




}
