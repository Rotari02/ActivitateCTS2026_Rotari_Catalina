package ro.ase.cts.cinematografLazyInitialization;

public class TestCinematografSingleton {
    public static void main(String[] args) {
        Cinematograf c1= Cinematograf.getInstanta(3);
        Cinematograf c2= Cinematograf.getInstanta(6);
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        //metoda getInstanta va crea o singura instanta , si anumea pe prima, cea cu 3 sali
    }
}
