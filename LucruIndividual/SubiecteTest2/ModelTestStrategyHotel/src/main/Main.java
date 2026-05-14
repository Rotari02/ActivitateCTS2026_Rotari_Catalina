package main;

import clase.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IVerificareActe verificareUE=new VerificareUE();
        IVerificareActe verificareNonUe=new VerificareNonUE();
        IVerificareActe verificareAmericani =new VerificaAmericani();

        Client client1 = new Client("Popescu Ion",  verificareUE);
        Client client2 = new Client("Kiril Anastasia",  verificareNonUe);
        Client client3 = new Client("John Doe",  verificareAmericani);

        List<Client> clienti = Arrays.asList(client1, client2, client3);
        for(Client client:clienti){
            client.prezintaActe();
        }

        System.out.println("Client cazati: "+clienti.size());

        System.out.println();

        client1.setTipVerificareActe(verificareAmericani);
        client1.prezintaActe();

    }
}
