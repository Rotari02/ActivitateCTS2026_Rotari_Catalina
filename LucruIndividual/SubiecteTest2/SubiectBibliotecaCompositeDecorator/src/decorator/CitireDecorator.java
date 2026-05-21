package decorator;

import composite.IElementBiblioteca;

public abstract class CitireDecorator implements IElementBiblioteca {
   private IElementBiblioteca elementDecoratBiblioteca;

    public CitireDecorator(IElementBiblioteca elementDecoratBiblioteca) {
        this.elementDecoratBiblioteca = elementDecoratBiblioteca;
    }

    @Override
    public void adaugaElement(IElementBiblioteca element) {
            this.elementDecoratBiblioteca.adaugaElement(element);
    }

    @Override
    public void stergeElement(IElementBiblioteca element) {
        this.elementDecoratBiblioteca.stergeElement(element);

    }

    @Override
    public IElementBiblioteca getNod(int index) {
        return elementDecoratBiblioteca.getNod(index);
    }

    @Override
    public void printeazaInformatii() {
        elementDecoratBiblioteca.printeazaInformatii();
    }

    public  abstract  void  afisareaCitire();
}
