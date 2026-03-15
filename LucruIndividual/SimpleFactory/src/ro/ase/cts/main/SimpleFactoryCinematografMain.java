package ro.ase.cts.main;

import ro.ase.cts.clase.Bilet;
import ro.ase.cts.factory.BiletFactory;
import ro.ase.cts.factory.TipBilet;


public class SimpleFactoryCinematografMain {
    public static void main(String[] args) {
        BiletFactory fabrica=new BiletFactory();
        Bilet bilet;

        bilet=fabrica.createInstance(TipBilet.Student);
        bilet.descriere();
        bilet=fabrica.createInstance(TipBilet.Adult);
        bilet.descriere();
        bilet=fabrica.createInstance(TipBilet.Vip);
        bilet.descriere();




    }
}
