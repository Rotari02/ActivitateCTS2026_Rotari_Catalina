package main;

import clase.CompositeUnitateCod;
import clase.ICode;
import clase.NodFrunzaUnitateCod;
import clase.TipNodFrunza;

public class Main {
    public static void main(String[] args) {
        ICode functie1=new NodFrunzaUnitateCod(TipNodFrunza.functe,"int getSuma(int a,int b)");
        ICode functie2=new NodFrunzaUnitateCod(TipNodFrunza.functe,"int getPutere(int a, int b)");
        ICode metoda1=new NodFrunzaUnitateCod(TipNodFrunza.metoda,"void printeaza rezultat");

        ICode clasaCalculator =new CompositeUnitateCod("Calculator");
        ICode clasOperatii =new CompositeUnitateCod("OperatiiMatematice");

        clasOperatii.adaugaUnitateCod(functie1);
        clasOperatii.adaugaUnitateCod(functie2);

        clasaCalculator.adaugaUnitateCod(metoda1);
        clasaCalculator.adaugaUnitateCod(clasOperatii);

        clasaCalculator.descreiUnitateCode(" ");

        System.out.println();
        clasaCalculator.getUnitateCode(0).descreiUnitateCode(" ");

        System.out.println();
        functie1.descreiUnitateCode(" ");
    }
}
