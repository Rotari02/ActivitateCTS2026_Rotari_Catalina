package main;

import observer.Client;
import observer.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant =new Restaurant();
        Client c1=new Client("Ion","ion@gmail.com","0786754575");
        Client c2=new Client("Ana","ana@gmail.com",null);
        Client c3=new Client("Ana",null,null);

        restaurant.adaugaObservere(c1);
        restaurant.adaugaObservere(c2);
        restaurant.adaugaObservere(c3);

        restaurant.trimiteNotificare("Ave, o noua pizza, consultati meniul!");
    }
}
