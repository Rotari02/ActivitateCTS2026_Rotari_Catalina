package decorator;

import composite.IElementBiblioteca;

public class TipAoa extends CitireDecorator{
    private String autor;
    private String titlu;
    private int an;

    public TipAoa(IElementBiblioteca elementDecoratBiblioteca, String autor, String titlu, int an) {
        super(elementDecoratBiblioteca);
        this.autor = autor;
        this.titlu = titlu;
        this.an = an;
    }

    @Override
    public void afisareaCitire() {
        System.out.println("Citire APA" +autor+" an "+an+" titlu "+titlu);
    }
}
