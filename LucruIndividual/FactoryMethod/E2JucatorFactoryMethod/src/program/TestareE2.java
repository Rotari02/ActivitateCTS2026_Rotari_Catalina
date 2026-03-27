package program;

import clase.AJucator;
import fabrici.FabricaAtacanti;
import fabrici.FabricaFundasi;
import fabrici.FabricaJucatori;
import fabrici.FabricaPortari;

public class TestareE2 {
    public static void main(String[] args) {
        FabricaJucatori fabricaPortari =new FabricaPortari(6);
        FabricaJucatori fabricaAtacanti = new FabricaAtacanti(3);
        FabricaJucatori fabricaFundasi =new FabricaFundasi(5);

        //creare obiecte
        AJucator portar1= fabricaPortari.creeazaJucator("Ion Armescu",4,false);
        portar1.descriereProfilJucator();

        AJucator portar2 = fabricaPortari.creeazaJucator("Horatiu MOLDOVAN", 12, false);
        portar2.descriereProfilJucator();

        AJucator atacant1  =  fabricaAtacanti.creeazaJucator("Pavel Mirtache",5,true);
        atacant1.descriereProfilJucator();

        AJucator fundas1 =  fabricaFundasi.creeazaJucator("Ion Moraru", 18,false);
        fundas1.descriereProfilJucator();

    }
}
