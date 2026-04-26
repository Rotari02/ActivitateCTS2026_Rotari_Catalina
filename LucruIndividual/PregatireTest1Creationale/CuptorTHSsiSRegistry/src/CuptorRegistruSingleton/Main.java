package CuptorRegistruSingleton;

public class Main {
    public static void main(String[] args) {
        RegistruCuptor registruCuptor =RegistruCuptor.getInstanta("Pacii Restaurant", "Iuliu Maniu 8, Bucuresti");

        registruCuptor.adaugaCuptor("C1",180);
        registruCuptor.adaugaCuptor("C2",200);
        registruCuptor.adaugaCuptor("C3",250);
        registruCuptor.adaugaCuptor("C4",300);

        PreparatOptimizat tarta=new PreparatOptimizat("Tarta",12,200);
        PreparatOptimizat pizza=new PreparatOptimizat("Pizza Diavola",30,250);
        PreparatOptimizat friptura=new PreparatOptimizat("Friptura",50,250);
        PreparatOptimizat somon = new PreparatOptimizat("Somon la cuptor", 20, 200);
        PreparatOptimizat sufleu = new PreparatOptimizat("Sufleu de ciocolata", 18, 260);

        ComandaRestaurant comanda1=new ComandaRestaurant(1, tarta);
        ComandaRestaurant comanda2=new ComandaRestaurant(2,pizza);
        ComandaRestaurant comanda3 = new ComandaRestaurant(3, friptura);
        ComandaRestaurant comanda4 = new ComandaRestaurant(4, somon);
        ComandaRestaurant comanda5 = new ComandaRestaurant(5, sufleu);

        registruCuptor.adaugaComandaOptima(comanda1);
        registruCuptor.adaugaComandaOptima(comanda2);
        registruCuptor.adaugaComandaOptima(comanda3);
        registruCuptor.adaugaComandaOptima(comanda4);
        registruCuptor.adaugaComandaOptima(comanda5);

        registruCuptor.afiseazaToateCuptoarele();



    }
}
