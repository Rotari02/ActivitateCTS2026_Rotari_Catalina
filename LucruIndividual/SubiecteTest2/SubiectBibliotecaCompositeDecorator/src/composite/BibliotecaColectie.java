package composite;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaColectie implements IElementBiblioteca{
    private List<IElementBiblioteca>  lista;
    private String numeColectie;

    public BibliotecaColectie( String numeColectie) {
        this.numeColectie = numeColectie;
        this.lista = new ArrayList<IElementBiblioteca>();
    }

    @Override
    public void adaugaElement(IElementBiblioteca element) {
        this.lista.add(element);
    }

    @Override
    public void stergeElement(IElementBiblioteca element) {
        this.lista.remove(element);
    }

    @Override
    public IElementBiblioteca getNod(int index) {
        return lista.get(index);
    }

    @Override
    public void printeazaInformatii() {
        System.out.println("\t Colectia "+numeColectie);
        for(IElementBiblioteca element:lista){
            element.printeazaInformatii();
        }
    }
}
