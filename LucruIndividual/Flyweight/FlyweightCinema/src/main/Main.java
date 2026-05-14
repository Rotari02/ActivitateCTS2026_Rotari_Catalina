package main;

import clase.FabricaFilmeFlyweight;
import clase.Film;
import clase.Sala;

import java.lang.management.GarbageCollectorMXBean;

public class Main {
    public static void main(String[] args) {
        FabricaFilmeFlyweight fabrica = new FabricaFilmeFlyweight();
        Sala sala1 = new Sala(1);
        Sala sala2 = new Sala(2);
        Sala sala3 = new Sala(3);
        Sala sala4 = new Sala(4);

        fabrica.getFilm("Titanic").play(sala1);
        fabrica.getFilm("Titanic").play(sala2);
        System.out.println("In lista exista: "+fabrica.dimensiuneListaFilme()+" filme");

        fabrica.getFilm("Moana").play(sala3);
        fabrica.getFilm("Moana").play(sala4);
        System.out.println("In lista exista: "+fabrica.dimensiuneListaFilme()+" filme");


    }

}
