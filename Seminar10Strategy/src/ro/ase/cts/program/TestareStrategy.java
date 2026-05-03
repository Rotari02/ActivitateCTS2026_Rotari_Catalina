package ro.ase.cts.program;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.PlataCash;

public class TestareStrategy {
    public static void main(String[] args) {
        Client client = new Client("Catalina");
        client.platesteTranzactie(300);
        client.setModalitatePlata(new PlataCash());
        client.platesteTranzactie(200);
    }
}