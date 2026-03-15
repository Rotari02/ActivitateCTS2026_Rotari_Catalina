package ro.ase.cts.clase;

public class MijlocTransportFactory {
    private static  MijlocTransportFactory instance;

    public  static  MijlocTransportFactory getInstance() {
        if(instance ==null)
            instance = new MijlocTransportFactory();
        return instance;
    }

    private MijlocTransportFactory() {
    }

    public  MijlocTransport getMijlocTransport(String  marca, int linie, TipMijlocTransport tip) {
        if(tip==TipMijlocTransport.AUTOBUZ)
            return  new Autobuz(marca, linie);
        if(tip==TipMijlocTransport.TRAMVAI)
            return  new Tramvai(marca, linie);
        if(tip==TipMijlocTransport.TROLEIBUZ)
            return  new Troleibuz(marca, linie);
        else
            return null;
    }
}
