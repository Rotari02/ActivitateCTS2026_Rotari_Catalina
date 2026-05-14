package clase;

import javax.print.attribute.standard.Destination;
import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String, IFlyweight> colectie;

    public FlyweightFactory() {
        this.colectie = new HashMap<>();
    }

    public IFlyweight getObiectFlyweight(Detinator detinator, Banca banca){
        String cheie =detinator.cnp+banca.denumire;
        if(!this.colectie.containsKey(cheie)){
            this.colectie.put(cheie,new ConcreteFlyweight(detinator,banca));
        }
        return this.colectie.get(cheie);
    }

    public int nrConturi(){
        return this.colectie.size();
    }
}
