package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> listaComenzi;

    public Operator() {
        this.listaComenzi =new ArrayList<>();
    }

    public void adaugaComanda(Command comanda){
        listaComenzi.add(comanda);
    }

    public void executaComanda(){
        if(listaComenzi.size()>0){
            listaComenzi.getFirst().pleacaInCursa();
            listaComenzi.removeFirst();
        }
        else {
            System.out.println("Adio, nu mai sunt comenzi");
        }
        }
}
