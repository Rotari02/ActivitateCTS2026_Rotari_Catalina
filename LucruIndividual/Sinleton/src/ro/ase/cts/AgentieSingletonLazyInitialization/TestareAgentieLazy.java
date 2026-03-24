package ro.ase.cts.AgentieSingletonLazyInitialization;

public class TestareAgentieLazy {
    public static void main(String[] args) throws  Exception {
        AgentieLazy agentie1 = AgentieLazy.getInstance("Alians");
        AgentieLazy agentie2 =AgentieLazy.getInstance("Travis");

        if(agentie1==agentie2) {
            System.out.println("Referinte identice");
        } else {
            System.out.println("Referinte diferite - singleton nerespectat");
        }

        //testare vanzare pachet
        agentie1.vindePachet();
        agentie2.vindePachet();

        System.out.println("Pachete vandute: "+agentie1.getNrPacheteVandute());
    }
}
