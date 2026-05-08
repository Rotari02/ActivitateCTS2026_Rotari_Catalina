package main;

import clase.*;

public class Main {
    public static void main(String[] args) {

        Credit credit1 = new Credit(10000, Moneda.EUR);
        Credit credit2 = new Credit(15000, Moneda.RON);
        Credit credit3 = new Credit(70000, Moneda.RON);

        ICredit proxy1 =
                new ProxyMoneda(
                        new ProxySumaSolicitata(credit1));

        ICredit proxy2 =
                new ProxyMoneda(
                        new ProxySumaSolicitata(credit2));

        ICredit proxy3 =
                new ProxyMoneda(
                        new ProxySumaSolicitata(credit3));

        proxy1.acordaCredit("Popescu Maria");
        System.out.println();

        proxy2.acordaCredit("Voinicescu Petru");
        System.out.println();

        proxy3.acordaCredit("Parvan Ana");

    }
}