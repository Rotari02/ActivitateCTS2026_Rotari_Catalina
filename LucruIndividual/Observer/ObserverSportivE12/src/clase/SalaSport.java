package clase;

import java.util.ArrayList;
import java.util.List;

public class SalaSport implements SubiectObservabil {
    private String nume;
    private String adresa;
    private List<Observer> clientiObservatori;
    private List<Meci> listaMeciuri;

    public SalaSport(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
        this.clientiObservatori =new ArrayList<Observer>();
        this.listaMeciuri = new ArrayList<Meci>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        this.clientiObservatori.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        this.clientiObservatori.remove(observer);
    }

    @Override
    public void notificaObserveri(Meci meci) {
        for(Observer client:clientiObservatori){
            client.primesteNotificare("Va asteptam la meciul de "+meci.getTipMeci()+" din data de "+meci.getData()+" ora "+meci.getOra()+"\n\tSala de sport "+this.nume+" adresa "+this.adresa);
        }
    }

    public void adaugaMeci(Meci meci){
        this.listaMeciuri.add(meci);
        this.notificaObserveri(meci);
    }
}
