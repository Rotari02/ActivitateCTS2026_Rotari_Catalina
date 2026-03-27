package program;

import clase.AClient;
import fabrici.FabricaClienti;
import fabrici.FabricaPF;
import fabrici.FabricaPJ;

public class Testare {
    public static void main(String[] args) {
        FabricaClienti fabricaPF=new FabricaPF();
        FabricaClienti fabricaPJ =new FabricaPJ();

        //creare clienti
        AClient pf =fabricaPF.creeazaClient("Ion Petrescu", "Bucuresti, Blv Unirii 14", "1020227878901");
        AClient pj=fabricaPJ.creeazaClient("SC Arav SRL", "Suceava, Blv ION Armeanu 24", "J28/124/2026");

        pf.profilClient();;
        pj.profilClient();
    }
}
