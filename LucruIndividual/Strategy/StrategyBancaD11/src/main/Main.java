package main;

import clase.ActePersoanaFizica;
import clase.ActePersoanaJuridica;
import clase.Client;
import clase.IModVerificareActe;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Popescu Andrei");
//        client.setModVerificareActe(new ActePersoanaFizica());
//        client.perzintaActe();
//        System.out.println();
//
//        client.setModVerificareActe(new ActePersoanaJuridica());
//        client.perzintaActe();
//        System.out.println();
        IModVerificareActe actePersoanaFizica = new ActePersoanaFizica();
        IModVerificareActe actePersoanaJuridica = new ActePersoanaJuridica();

        client.setModVerificareActe(actePersoanaFizica);
        client.perzintaActe();
        System.out.println();

        client.setModVerificareActe(actePersoanaJuridica);
        client.perzintaActe();
    }
}
