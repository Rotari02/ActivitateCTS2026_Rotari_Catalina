package ro.ase.cts.AutoritatePescuitSingletonEagerAndLazy;

import ro.ase.cts.AutoritatePescuitSingletonRegistry.AutoritatePescuitSingletonRegistry;

public class TestareAutoritatePescuitEagerSiLazy {
    public static void main(String[] args) {
        AutoritatePescuitEager autoritatePescuitEager =AutoritatePescuitEager.getInstance();
        autoritatePescuitEager.concediaza(1);
        System.out.println(autoritatePescuitEager.toString());

        autoritatePescuitEager.setDenumire("AVA");
        autoritatePescuitEager.setWebsite("ava.ro");
        System.out.println(autoritatePescuitEager.toString());

        autoritatePescuitEager.emiteAutorizatie("Catalina Ro");
        System.out.println(autoritatePescuitEager.toString());

        AutoritatePescuitEager autoritatePescuitEager2 = AutoritatePescuitEager.getInstance();
        autoritatePescuitEager2.emiteAutorizatie("Valcescu Vlad");
        System.out.println(autoritatePescuitEager2.toString());

        AutoritatePescuitSingletonLazyI autoritatePescuitSingletonLazy= AutoritatePescuitSingletonLazyI.getInstanta("Maria","maria.ro",10,10);
        autoritatePescuitSingletonLazy.emiteAutorizatie("Vlad Petrascu");
        System.out.println(autoritatePescuitSingletonLazy);

        AutoritatePescuitSingletonLazyI autoritatePescuitSingletonLazy2 = AutoritatePescuitSingletonLazyI.getInstanta("Pera","pera.ro",10,20);
        autoritatePescuitSingletonLazy2.emiteAutorizatie("Pera Maria");
        System.out.println(autoritatePescuitEager2);
    }
}
