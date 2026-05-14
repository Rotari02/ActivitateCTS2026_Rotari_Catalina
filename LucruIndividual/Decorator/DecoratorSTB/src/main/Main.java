package main;

import clase.BiletSTB;
import clase.BiletSarbatoare;
import clase.IBilet;

public class Main {
    public static void main(String[] args) {
        IBilet bilet1=new BiletSTB(2);
        IBilet bilet2=new BiletSTB(10);

        IBilet bilet1Decorat =new BiletSarbatoare(bilet1,"Revelion 2026 ");
        bilet1Decorat.descriereBillet();

        IBilet bilet2Decorat=new BiletSarbatoare(bilet2,"1 DECEMBRIE ");
        bilet2Decorat.descriereBillet();
    }
}
