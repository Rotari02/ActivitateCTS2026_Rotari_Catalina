package decorator;

import composite.IElementBiblioteca;

public class TipChigago extends CitireDecorator {
    private String autor;
    private String titlu;
    private String editura;
    private int an;

    public TipChigago(IElementBiblioteca elementDecoratBiblioteca, String autor, String titlu, String editura, int an) {
        super(elementDecoratBiblioteca);
        this.autor = autor;
        this.titlu = titlu;
        this.editura = editura;
        this.an = an;
    }


    @Override
    public void afisareaCitire() {
        System.out.println("Citare Chicago: " + autor + ". \"" + titlu + "\". " + editura + ", " + an + ".");
    }
}
