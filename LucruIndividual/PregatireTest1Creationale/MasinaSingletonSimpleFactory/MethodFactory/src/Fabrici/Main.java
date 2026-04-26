package Fabrici;

import clase.AMasina;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactoryMasina fabricaSuv =new FectorySuv();
        FactoryMasina fbricaVan= new FabricaVan();
        FactoryMasina fabricaSedan=new FactorySedan();

        List<AMasina> listaMasini =new ArrayList<>();

        try{
            AMasina m1 = fabricaSedan.creeazaMasina("IL10ROL", "BWM", 285000.00);
            AMasina m2 =fabricaSedan .creeazaMasina("BV23MMI", "Mercedes", 175000.00);
            AMasina m3 = fbricaVan.creeazaMasina("B100WOW", "Audi", 97000.00);
            AMasina m4 =fabricaSuv.creeazaMasina("IF40HAH", "Volkswagen", 120000.00);

            listaMasini.add(m1);
            listaMasini.add(m2);
            listaMasini.add(m3);
            listaMasini.add(m4);

            for(AMasina masina: listaMasini){
                masina.detaliiMasian();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
