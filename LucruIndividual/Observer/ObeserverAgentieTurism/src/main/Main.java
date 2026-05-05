package main;

import clase.Agentie;
import client.ClientFidel;

public class Main {
    public static void main(String[] args) {
        ClientFidel clientRotari=new ClientFidel("Rotari");
        ClientFidel clientPopa=new ClientFidel("Popa");
        ClientFidel clientArmeanu=new ClientFidel("Armeanu");

        Agentie agentie=new Agentie("TurismRo");

        agentie.adaugaObserver(clientRotari);
        agentie.adaugaObserver(clientPopa);
        agentie.notificareOfertaNoua();
        agentie.stergeObserver(clientPopa);
        agentie.adaugaObserver(clientArmeanu);
        agentie.notificareReducerePret();
    }
}
