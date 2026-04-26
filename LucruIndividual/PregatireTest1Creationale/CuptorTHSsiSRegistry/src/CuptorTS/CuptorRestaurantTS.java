package CuptorTS;

import java.util.ArrayList;
import java.util.List;

public class CuptorRestaurantTS {
    private String denumireCuptor;
    private int temperaturaMaxima;
    private List<ComandaPreparat> listaAsteptare;

    private static CuptorRestaurantTS instanta=null;

    private CuptorRestaurantTS(String denumireCuptor, int temperaturaMaxima) {
        this.denumireCuptor = denumireCuptor;
        this.temperaturaMaxima = temperaturaMaxima;
        this.listaAsteptare = new ArrayList<>();
    }

    public static synchronized CuptorRestaurantTS getInstanta(String denumireCuptor, int temperaturaMaxima) {
        if(instanta==null){
            instanta=new CuptorRestaurantTS(denumireCuptor, temperaturaMaxima);
        }
        return instanta;
    }

    public void adaugaComandaInAstepatre(ComandaPreparat comanda){
        if(comanda.getPreparat().getTemperaturaNecesara()<=this.temperaturaMaxima){
            listaAsteptare.add(comanda);
            System.out.println("Comanda "+comanda.getIdComanda()+" a fost adaugat in lista de asteptare a cuptorului unic");
        } else{
            System.out.println("Comanda "+comanda.getIdComanda()+" Nu poate fi facut, Preparatul necesita "+comanda.getPreparat().getTemperaturaNecesara()+" grade, iar cuptorul suporta maxim "+this.temperaturaMaxima);
        }
    }

    public  void afiseazaListaAsteptare() {
        System.out.println("\n LISTA DE ASTEPTARE A CUPTORULUI UNIC===");
        System.out.println("Cutor: "+denumireCuptor+" Temperatura maxima "+temperaturaMaxima+ ", grade.");

        if(listaAsteptare.isEmpty()){
            System.out.println("NU exista preparate in astepatre");
        } else{
          for(ComandaPreparat comanda:listaAsteptare){
              System.out.println("Comanda: "+comanda.getIdComanda()+"-> preparat: "+ comanda.getPreparat().getDenumire()+" timp: "+comanda.getPreparat().getTimpGatireMinute()
              +"temperatura necesara: "+comanda.getPreparat().getTemperaturaNecesara()+ " grade.");
          }
        }

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CuptorRestaurantTS{");
        sb.append("denumireCuptor='").append(denumireCuptor).append('\'');
        sb.append(", temperaturaMaxima=").append(temperaturaMaxima);
        sb.append(", numarComenziAsteptare=").append(listaAsteptare.size());
        sb.append('}');
        return sb.toString();
    }
}
