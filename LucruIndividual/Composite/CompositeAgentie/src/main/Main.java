package main;

import clase.Categorie;
import clase.Item;
import clase.Optiune;

public class Main {
    public static void main(String[] args) {
        Optiune categorieFile = new Categorie("file");
        Optiune categorieCamere = new Categorie("Camere");
        Optiune categorieOferte = new Categorie("Oferte");

        Optiune iDeschis = new Item("Deschis");
        Optiune iSalvat = new Item("Salvat");
        Optiune iVizualizare = new Item("Vizualizare camere");
        Optiune iEditare = new Item("Editare camere");
        Optiune iOfertaAnulNou = new Item("Oferte Anul Nou");
        Optiune iCreazaOferta = new Item("Creaza oferta");

        try {
            categorieCamere.adaugaNod(iVizualizare);
            categorieCamere.adaugaNod(iEditare);

            categorieOferte.adaugaNod(iOfertaAnulNou);
            categorieOferte.adaugaNod(iCreazaOferta);

            categorieFile.adaugaNod(iDeschis);
            categorieFile.adaugaNod(iSalvat);
            categorieFile.adaugaNod(categorieCamere);
            categorieFile.adaugaNod(categorieOferte);

            categorieFile.stergeNod(iSalvat);
            categorieOferte.stergeNod(iSalvat);

            categorieFile.descriere();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
