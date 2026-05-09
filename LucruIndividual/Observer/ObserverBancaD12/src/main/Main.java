package main;

import Observer.ClientBanca;
import Observer.IObserverBanca;
import Subiect.Banca;
import Subiect.ISubiectBanca;

public class Main {
    public static void main(String[] args) {
        IObserverBanca client1 = new ClientBanca("Popescu Ana");
        IObserverBanca client2 = new ClientBanca("Popescu Ion");
        IObserverBanca client3 = new ClientBanca("Popescu Stefan");

        ISubiectBanca banca = new Banca("ING", "Bucuresti, Blv:Iuliu Maniu, Nr.14", "ing@gmail.com", "07896234");
        banca.adaugaObserver(client1);
        banca.adaugaObserver(client2);
        banca.adaugaObserver(client3);

        banca.trimiteNotificare("Cu aplicatia ING ai 10% bani inapoi luna aceasta la partenrerii nostri");
        System.out.println();

        banca.stergeObserver(client2);
        banca.trimiteNotificare("Cu aplicatia noastra ING aveti toate informatiile la un click");


    }
}
