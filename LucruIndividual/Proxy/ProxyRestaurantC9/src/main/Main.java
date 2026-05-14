package main;

import clase.AchizitieMedicament;
import clase.Client;
import clase.IAchizitie;
import clase.ProxyReteta;

public class Main {
    public static void main(String[] args) {
        Client c1=new Client("Ion",true);
        Client c2=new Client("Valentin",false);

        IAchizitie achizitie =new AchizitieMedicament();
        IAchizitie proxy =new ProxyReteta(achizitie);
        proxy.achizitioneazaMedicament("Paracetamol",c1);
        proxy.achizitioneazaMedicament("Parasinus",c2);
    }
}

