package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Observer observer1 = new Client("Ana");
        Observer observer2 = new Client("Petru");
        Observer observer3 = new Client("Ion");

        Meci meciFotbal = new Meci("FC Unirea Slobozia - FC Victoria Tandarei", "17 mai 2025",
                "16:00", TipMeci.FOTBAL);
        Meci meciHandbal = new Meci("CSM Steaua - CSM Bacau", "24 mai 2025",
                "15:30", TipMeci.HANDBAL);
        Meci meciVolei = new Meci("CS DINAMO BUCURESTI - CS Stiinta Bacau", "1 iunie 2025",
                "14:00", TipMeci.VOLEI);

        SubiectObservabil sala = new SalaSport("Arena nationala ", "Bucuresti BLD. Basarabia");
        sala.adaugaObserver(observer1);
        sala.adaugaObserver(observer2);
        sala.adaugaObserver(observer3);

        ((SalaSport) sala).adaugaMeci(meciFotbal);
        System.out.println();

        ((SalaSport) sala).adaugaMeci(meciVolei);
        System.out.println();

        sala.stergeObserver(observer1);
        ((SalaSport) sala).adaugaMeci(meciHandbal);





    }
}
