package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruClienti {
    private Map<String, ClientAbstract> clienti = new HashMap<>();

    public ClientAbstract getClient(String nume, String telefon, String mail) {
        ClientAbstract client = clienti.get(telefon);
        if (client == null) {
            client = new Client(nume, telefon, mail);
            clienti.put(telefon, client);
        }
        return client;
    }
}