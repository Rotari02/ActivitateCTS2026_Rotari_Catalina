import java.util.HashMap;
import java.util.Map;

public class Testare  {
    public static void main(String[] args) {
        Map<Integer,String> istoricRezervari =new HashMap<>();
        istoricRezervari.put(1,"Meci Romania- Republica Moldova");
        AbstractCont prototip =new Cont("Catalina","catalina@gmail.com","05/03/2026",istoricRezervari);

        AbstractCont clona =prototip.clona();

        clona.adaugaRezervare("Meci Romania-Ucraina");
        System.out.println(prototip.toString());
        System.out.println("\n");
        System.out.println(clona.toString());
    }
}
