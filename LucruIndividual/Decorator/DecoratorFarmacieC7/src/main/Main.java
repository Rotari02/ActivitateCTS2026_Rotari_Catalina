package main;

import clase.BonCuFelicitare;
import clase.BonDeCasa;
import clase.IBon;

public class Main {
    public static void main(String[] args) {
        IBon bon1= new BonDeCasa(1,35.09);
        IBon bonCuFelicitare=new BonCuFelicitare(bon1);
        bonCuFelicitare.printeazaBon();

    }
}
