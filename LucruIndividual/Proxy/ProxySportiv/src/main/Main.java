package main;

import clase.IVanzareBilet;
import clase.Persoana;
import clase.ProxyVarsta;
import clase.VindeBilet;

public class Main {
    public static void main(String[] args) {
        Persoana p1=new Persoana("Ion",12);
        Persoana p2=new Persoana("Vlad",16);

        IVanzareBilet proxy=new ProxyVarsta(new VindeBilet());
        proxy.vindeBilet(p1);
        proxy.vindeBilet(p2);
    }
}
