package ro.ase.cts.program;

import ro.ase.cts.clase.NotaDePlata;
import ro.ase.cts.decorator.NotaDePlataCraciun;
import ro.ase.cts.decorator.NotaDePlataDecorator;
import ro.ase.cts.decorator.NotaDePlataZiuaMuncii;

public class Main {
    public static void main(String[] args) {
        NotaDePlata notaDePlata = new NotaDePlata(120.00f, "08 Ianuarie");
        notaDePlata.printeaza();

        NotaDePlataDecorator notaDePlataDecorator;

        int a = 2;
        if (a == 1) {
            notaDePlataDecorator = new NotaDePlataCraciun(notaDePlata);
        } else {
            notaDePlataDecorator = new NotaDePlataZiuaMuncii(notaDePlata);
        }

        notaDePlataDecorator.printeaza();
        notaDePlataDecorator.printeazaFelicitare();
    }
}
