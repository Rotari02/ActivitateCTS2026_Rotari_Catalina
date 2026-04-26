package CuptorRegistruSingleton;

import CuptorTS.ComandaPreparat;

import java.util.ArrayList;
import java.util.List;

public class Cuptor {
    private String codCuptor;
    private int temperaturaMaxima;
    private List<ComandaRestaurant> comenziInAsteptare;


    public Cuptor(String codCuptor, int temperaturaMaxima) {
        this.codCuptor = codCuptor;
        this.temperaturaMaxima = temperaturaMaxima;
        this.comenziInAsteptare=new ArrayList<>();
    }

    public String getCodCuptor() {
        return codCuptor;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void adaugaComanda(ComandaRestaurant comanda) {
        comenziInAsteptare.addLast(comanda);
    }

    public int calaculeazaTimpTotalDeAsteptare() {
        int total=0;
        for(ComandaRestaurant comanda: comenziInAsteptare){
            total+=comanda.getPreparat().getTimpDeGatire();
        }
        return total;
    }

    public void afiseazaComenziInAsteptare() {
        System.out.println("\nCuptor "+ codCuptor+" temperatura maxima: "+temperaturaMaxima+" timp total de asteptare: "+calaculeazaTimpTotalDeAsteptare()+" minute");

        if(comenziInAsteptare.isEmpty()){
            System.out.println("Nu exista comenzi in asteptare ");
        } else{
            for(ComandaRestaurant comanda:comenziInAsteptare){
                System.out.println("Comanda "+comanda.getIdComanda()+" preparat denumire: "+comanda.getPreparat().getDenumire()+ "timp: "
                     +comanda.getPreparat().getTimpDeGatire() +" temperatura: "+comanda.getPreparat().getTemperaturaNecesara()+" grade");
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuptor{");
        sb.append("codCuptor='").append(codCuptor).append('\'');
        sb.append(", temperaturaMaxima=").append(temperaturaMaxima);
        sb.append(", timpTotalDeAsteptare=").append(calaculeazaTimpTotalDeAsteptare());
        sb.append('}');
        return sb.toString();
    }
}
