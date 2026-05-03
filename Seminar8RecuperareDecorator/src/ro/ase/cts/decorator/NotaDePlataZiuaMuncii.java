package ro.ase.cts.decorator;

import ro.ase.cts.clase.NotaDePlataAbstract;

public class NotaDePlataZiuaMuncii extends NotaDePlataDecorator {

    public NotaDePlataZiuaMuncii(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani de Ziua Muncii!");
    }
}