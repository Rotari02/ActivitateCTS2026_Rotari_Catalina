package main;

import clase.PachetTransport;
import clase.Persoana;
import clase.ProxyPachet;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Andra", 40);
        PachetTransport pachetTransport = new PachetTransport(persoana);
        pachetTransport.rezervaPachet();

        ProxyPachet pachetProxyTransport = new ProxyPachet(persoana);
        pachetProxyTransport.rezervaPachet();

        System.out.println("\t________________________________");
        Persoana persoana2 = new Persoana("Elvira", 70);
        PachetTransport pachetTransport2 = new PachetTransport(persoana2);
        pachetTransport2.rezervaPachet();

        ProxyPachet proxyPachetTransport2 = new ProxyPachet(persoana2);
        proxyPachetTransport2.rezervaPachet();
    }
}
