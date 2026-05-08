package main;

import clase.Agentie;
import clase.Filiala;
import clase.IUnitateBancara;
import clase.Sucursala;

public class Main {
    public static void main(String[] args) {
        IUnitateBancara sucursala = new Sucursala("Banca Comerciala Romana", "Bucuresti, Piata Victoriei");

        IUnitateBancara agentie1 = new Agentie("Agetie 1 sector 6", "Bd. Iuliu Maniu, Nr.300");
        IUnitateBancara agentie2 = new Agentie("Agentie 2  sector3", "Bd. Energeticienilor, Nr.1");

        IUnitateBancara filiala1 = new Filiala("Filiala 1", "Str.Izvor, Nr.4");
        IUnitateBancara filiala2 = new Filiala("Filiala 2", "Str. Gheorghe Dej, Nr1");
        IUnitateBancara filiala3 = new Filiala("Filiala 3", "Str.Paris, Nr1");

        agentie1.adaugaComponenta(filiala1);
        agentie1.adaugaComponenta(filiala2);
        agentie2.adaugaComponenta(filiala3);

        sucursala.adaugaComponenta(agentie1);
        sucursala.adaugaComponenta(agentie2);

        sucursala.descriereStructura("\t");
        System.out.println("\n_______________Stergem un element - Filiala 2_______________");
        agentie1.stergeComponente(filiala2);
        sucursala.descriereStructura("\t");


    }
}
