package main;

import clase.Client;
import clase.FacadeFarmacie;
import clase.Medicament;
import clase.Reteta;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Medicament m1=new Medicament("Paracetamol",12.5f,2);
        Medicament m2=new Medicament("Advil",20.5f,5);
        Medicament m3=new Medicament("Parasinus",13.5f,3);

        Reteta reteta1=new Reteta(List.of(m1,m2,m3));
        Reteta reteta2=new Reteta(List.of(m1,m2));

        Client c1=new Client("ANDREIA",true);
        FacadeFarmacie facade=new FacadeFarmacie(reteta1,c1);
        facade.achizitioneazaReteta();
        System.out.println();

        facade.setReteta(reteta2);
        facade.achizitioneazaReteta();
    }
}

