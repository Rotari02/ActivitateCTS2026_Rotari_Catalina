package ro.ase.cts.clase;

public class PlataCash implements ModalitatePlata {
    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println("Clientul cu numele: " + numeClient + " a platit cash suma de " + suma + " roni");
    }
}