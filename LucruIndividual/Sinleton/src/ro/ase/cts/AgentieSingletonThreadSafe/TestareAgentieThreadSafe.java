package ro.ase.cts.AgentieSingletonThreadSafe;

public class TestareAgentieThreadSafe {
    public static void main(String[] args) {
        Agentie agentie1= Agentie.getInstanta("TravisRo","Bucuresti",10);
        Agentie agentie2=Agentie.getInstanta("RomTur","Cluj",50);

        System.out.println(agentie1.toString());
        System.out.println(agentie2.toString());

        //testare vanzare pachet
        agentie1.vindePachet();
        agentie2.vindePachet();

        //testare vanzare pachete
        System.out.println(agentie1.toString());
    }
}
