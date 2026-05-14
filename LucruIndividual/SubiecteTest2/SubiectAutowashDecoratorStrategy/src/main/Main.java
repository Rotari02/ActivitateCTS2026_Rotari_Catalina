package main;

import decorator.*;
import strategy.ClientSpalatorie;
import strategy.PlataCard;
import strategy.PlatesteCash;
import strategy.PlatesteTelefon;

public class Main {
    public static void main(String[] args) {
        System.out.println("===============DECORATOR=================");
        System.out.println();

        IAbstractWashOptions program1=new SpalarePeriiFine(new ProgramStandard());
        IAbstractWashOptions program2=new SpalareSasiu(new ProgramStandard());
        IAbstractWashOptions program3=new SpalareApaDedurizata(new ProgramStandard());
        IAbstractWashOptions programStandard =new ProgramStandard();
        program1.descriereSpalare();
        System.out.println("Pret total "+program1.getPret()+ " RON");
        System.out.println();

        program2.descriereSpalare();
        System.out.println("Pret total "+program2.getPret()+ " RON");
        System.out.println();

        program3.descriereSpalare();
        System.out.println("Pret total "+program3.getPret()+ " RON");
        System.out.println();

        programStandard.descriereSpalare();
        System.out.println("Pret total "+programStandard.getPret()+" RON");
        System.out.println();


        System.out.println("\n====================STRATEGY==================");
        ClientSpalatorie client =new ClientSpalatorie("Ana");
        client.setModPlata(new PlataCard());
        client.achitaSplare(40);
        System.out.println();


        client.setModPlata(new PlatesteCash());
        client.achitaSplare(30);
        System.out.println();

        client.setModPlata(new PlatesteTelefon());
        client.achitaSplare(50);
        System.out.println();






    }
}
