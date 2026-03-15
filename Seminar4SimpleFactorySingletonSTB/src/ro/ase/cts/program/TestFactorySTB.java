package ro.ase.cts.program;

import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.clase.MijlocTransportFactory;
import ro.ase.cts.clase.TipMijlocTransport;

public class TestFactorySTB {

    public static void afisareMijlocTransport(MijlocTransport mijlocTransport) {
        mijlocTransport.afisareDescriere();
    }
    public static void main(String[] args) {
        //MijlocTransportFactory factory = new MijlocTransportFactory();
        MijlocTransportFactory factory = MijlocTransportFactory.getInstance();


        MijlocTransport autobuz= factory.getMijlocTransport("Mercedes",435, TipMijlocTransport.AUTOBUZ);
        MijlocTransport troleibuz= factory.getMijlocTransport("Volvo",45, TipMijlocTransport.TROLEIBUZ);
        MijlocTransport trmvai= factory.getMijlocTransport("Zimm",5, TipMijlocTransport.TRAMVAI);

        afisareMijlocTransport(autobuz);
        afisareMijlocTransport(troleibuz);
        afisareMijlocTransport(trmvai);



    }
}
