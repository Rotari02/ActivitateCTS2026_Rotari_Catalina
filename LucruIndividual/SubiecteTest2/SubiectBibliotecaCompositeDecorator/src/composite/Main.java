package composite;

public class Main {
    public static void main(String[] args) {
        IElementBiblioteca colectieStiinta = new BibliotecaColectie("Stiinta");
        IElementBiblioteca colectieArta = new BibliotecaColectie("Arta");
        IElementBiblioteca biblioteca = new BibliotecaColectie("Biblioteca Centrala");

        IElementBiblioteca  carte1 = new CartNodFrunza("Scurta istorie a timpului", "Stephen Hawking");
        IElementBiblioteca  carte2 = new CartNodFrunza("Cosmos", "Carl Sagan");
        IElementBiblioteca  carte3 = new CartNodFrunza("Mona Lisa", "R. P. C. Mutter");
        IElementBiblioteca  carte4 = new CartNodFrunza("Istoria artei", "E. H. Gombrich");

        colectieStiinta.adaugaElement(carte1);
        colectieStiinta.adaugaElement(carte2);
        colectieArta.adaugaElement(carte3);
        colectieArta.adaugaElement(carte4);

        biblioteca.adaugaElement(colectieArta);
        biblioteca.adaugaElement(colectieStiinta);

        biblioteca.printeazaInformatii();


    }
}
