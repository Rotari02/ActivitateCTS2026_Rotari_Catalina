package ro.ase.cts.AutoritatePescuitSingletonRegistry;

public class TestareAutoritatePescuitSingletonRegistry {
    public static void main(String[] args) {
        AutoritatePescuitSingletonRegistry autoritatePescuit1 =AutoritatePescuitSingletonRegistry.getInstanta("ANAF","anpa.ro",100);
        Autorizatie autorizatieCatalinaRotari =autoritatePescuit1.emiteAutorizatie("Catalina Rotari");
        System.out.println(autorizatieCatalinaRotari);

        Autorizatie autorizatieCata2 =autoritatePescuit1.emiteAutorizatie("Catalina Ro");
        System.out.println(autorizatieCatalinaRotari);
    }
}
