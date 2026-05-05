package main;

import clase.Rezervare;
import clase.StareEfectuata;
import clase.StareNeplatita;
import clase.StarePlatita;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare=new Rezervare(1);

        StareNeplatita neplatita=new StareNeplatita();
        neplatita.faActiunea(rezervare);

        StarePlatita platita=new StarePlatita();
        platita.faActiunea(rezervare);

        StareEfectuata efectuata=new StareEfectuata();
        efectuata.faActiunea(rezervare);
    }
}
