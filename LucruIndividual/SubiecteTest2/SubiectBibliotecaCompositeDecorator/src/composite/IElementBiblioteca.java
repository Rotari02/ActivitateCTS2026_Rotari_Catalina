package composite;

public interface IElementBiblioteca {
    void adaugaElement(IElementBiblioteca element);
    void stergeElement(IElementBiblioteca element);
    IElementBiblioteca getNod(int index);
    void printeazaInformatii();
}
