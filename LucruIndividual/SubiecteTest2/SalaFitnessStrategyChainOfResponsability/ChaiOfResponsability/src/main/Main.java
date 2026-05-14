package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        HandlerAccidentare antrenor = new Antrenor();
        HandlerAccidentare asistent = new Asistenta();
        HandlerAccidentare medic = new Medic();
        HandlerAccidentare ambulanta = new Ambulanta();


        antrenor.setSuccesor(asistent);
        asistent.setSuccesor(medic);
        medic.setSuccesor(ambulanta);


        System.out.println("Caz 1: Cursant neaccidentat");
      antrenor.trateazaAccidentarea(null);

        System.out.println("\nCaz 2: Accidentare USOARA");
        FisaAcidentare fisa1 =new FisaAcidentare("Ion",TipGravitateAccidentare.USOARA);
        antrenor.trateazaAccidentarea(fisa1);

        System.out.println("\nCaz 2: Accidentare Medie");
        FisaAcidentare fisa2 =new FisaAcidentare("Ioana",TipGravitateAccidentare.MEDIE);
        antrenor.trateazaAccidentarea(fisa2);


        System.out.println("\nCaz 4: Accidentare GRAVA");
     FisaAcidentare fisa3 =new FisaAcidentare("Maria",TipGravitateAccidentare.GRAVA);
     antrenor.trateazaAccidentarea(fisa3);


        HandlerAccidentare antrenorFaraAsistent = new Antrenor();
        HandlerAccidentare medicDirect = new Medic();
        HandlerAccidentare ambulantaDirect = new Ambulanta();

        antrenorFaraAsistent.setSuccesor(medicDirect);
        medicDirect.setSuccesor(ambulantaDirect);

        System.out.println("\nCaz 5: Fara asistent medical - accidentare USOARA");
        FisaAcidentare fisa4 = new FisaAcidentare("George", TipGravitateAccidentare.USOARA);
        antrenorFaraAsistent.trateazaAccidentarea(fisa4);

        System.out.println("\nCaz 6: Fara asistent medical - accidentare GRAVA");
        FisaAcidentare fisa5 = new FisaAcidentare("Irina", TipGravitateAccidentare.GRAVA);
        antrenorFaraAsistent.trateazaAccidentarea(fisa5);













    }
}
