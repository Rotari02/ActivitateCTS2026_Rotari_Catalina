package CuptorTS;

public class MainCuptorTS {
    public static void main(String[] args) {
        CuptorRestaurantTS cuptor1=CuptorRestaurantTS.getInstanta("Cuptor pizza",240);
        CuptorRestaurantTS cuptor2=CuptorRestaurantTS.getInstanta("Cuptor dulciuri", 250);


        System.out.println(cuptor1);
        System.out.println(cuptor2);

        PreparatTS pizza1=new PreparatTS("Margherita",15,200);
        PreparatTS lasagna =new PreparatTS("Lasgna",35,90);
       PreparatTS coaste = new PreparatTS("Coaste BBQ", 35, 240);
        PreparatTS souffle = new PreparatTS("Souffle", 20, 260);

        ComandaPreparat comanda1=new ComandaPreparat(1,pizza1);
        ComandaPreparat comanda2=new ComandaPreparat(2,lasagna);
        ComandaPreparat comanda3=new ComandaPreparat(3,coaste);
        ComandaPreparat comanda4=new ComandaPreparat(4,souffle);

        cuptor1.adaugaComandaInAstepatre(comanda1);
        cuptor1.adaugaComandaInAstepatre(comanda2);
        cuptor1.adaugaComandaInAstepatre(comanda3);
        cuptor1.adaugaComandaInAstepatre(comanda4);

        cuptor1.afiseazaListaAsteptare();

        System.out.println("====verificare instanta unica cuptor singleton ts");
        ComandaPreparat comanda5=new ComandaPreparat(5,pizza1);
        cuptor2.adaugaComandaInAstepatre(comanda5);
        cuptor2.afiseazaListaAsteptare();



        //printare cuptoare
        System.out.println("\n========PRINTAR_ECUPTOARE======");
        System.out.println(cuptor1);
        System.out.println(cuptor2);


        System.out.println("\n ====verificare alta modalitate");
        if(cuptor1==cuptor2){
            System.out.println("===Aceiasi instanta====");
        } else{
            System.out.println("===instanta diferite===");
        }

    }
}
