package clase;

import client.Observer;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Subiect {

    private List<Observer> observeri;
    private String numeAgentie;

    public Agentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
        observeri = new ArrayList<Observer>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        observeri.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        observeri.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (Observer observer : observeri) {
            observer.receptionareMesaj(numeAgentie + ":" + mesaj);
        }
    }

    public void notificareOfertaNoua() {
        trimiteNotificare("A fost adaugata o noua oferta. Vedeti noul nostru Catalog");
    }

    public void notificareReducerePret() {
        trimiteNotificare("Preturile au noi reduceri. Vedeti noul nostru catalog!");
    }
}
