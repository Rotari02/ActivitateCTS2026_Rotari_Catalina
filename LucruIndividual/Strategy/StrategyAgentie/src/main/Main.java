package main;

import clase.Card;
import clase.Cash;
import clase.Client;
import clase.PayPal;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ionescu Ana");

        client.setModPlata(new Card());
        client.plateste(200);

        client.setModPlata(new Cash());
        client.plateste(100);

        client.setModPlata(new PayPal());
        client.plateste(150);

    }
}
