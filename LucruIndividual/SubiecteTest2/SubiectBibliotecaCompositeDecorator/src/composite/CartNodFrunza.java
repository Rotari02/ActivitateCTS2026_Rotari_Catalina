package composite;

public class CartNodFrunza  implements IElementBiblioteca{
    private String titlu;
    private String autor;

    public CartNodFrunza(String titlu, String autor) {
        this.titlu = titlu;
        this.autor = autor;
    }

    @Override
    public void adaugaElement(IElementBiblioteca element) {
       throw  new RuntimeException("Cartea este nod frunza , operatia nu este permisa!");
    }

    @Override
    public void stergeElement(IElementBiblioteca element) {
        throw new RuntimeException("Cartea este nod frunza , operatia nu este permisa!");
    }

    @Override
    public IElementBiblioteca getNod(int index) {
        throw  new RuntimeException("Cartea este nod frunza , operatia nu este permisa!");

    }

    @Override
    public void printeazaInformatii() {
        System.out.println("Carte: "+titlu+" autor: "+autor);
    }
}
