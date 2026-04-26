public class Main {
    public static void main(String[] args) {
        ILive prototip =new TransmisiuneLivePrototype("Meci Ro-Uc",450);
        prototip.adaugaComentariu("GOOL;");
        prototip.adaugaComentariu("Hai Romania");
        prototip.adaugaComentariu("Am castigat");

        for(int i=0;i<10;i++){
            prototip.conectareSpectator();
        }
        prototip.transmiteEvenimentLive();;

        System.out.println("=======clona=========");
        ILive clona =prototip.copiaza();



        for(int i=0;i<5;i++) {
            clona.conectareSpectator();
        }

        clona.adaugaComentariu("CE BRAVO, ROMANIA");
        clona.adaugaComentariu("Bravo pentru noi");
        clona.transmiteEvenimentLive();

    }
}
