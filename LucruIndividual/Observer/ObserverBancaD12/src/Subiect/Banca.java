package Subiect;

import Observer.IObserverBanca;

import java.util.ArrayList;
import java.util.List;

public class Banca implements ISubiectBanca {
    private String denumire;
    private String adresa;
    private String email;
    private String numarTelefon;

    private List<IObserverBanca> listaClienti;

    public Banca(String denumire, String adresa, String email, String numarTelefon) {
        this.denumire = denumire;
        this.adresa = adresa;
        this.email = email;
        this.numarTelefon = numarTelefon;
        this.listaClienti = new ArrayList<IObserverBanca>();
    }

    @Override
    public void adaugaObserver(IObserverBanca observer) {
        this.listaClienti.add(observer);
    }

    @Override
    public void stergeObserver(IObserverBanca observer) {
        this.listaClienti.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (IObserverBanca client : this.listaClienti) {
            client.primesteNotificare(mesaj + this.mesajDeContactatBanca());
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Banca{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", listaClienti=").append(listaClienti);
        sb.append('}');
        return sb.toString();
    }

    private String mesajDeContactatBanca() {
        return "\n\t Pentru mai multe detalii, echipa bancii: " + this.denumire + " va asteapta la  adresa:" + this.adresa + " sau sa ne contactati la emailul:" + this.email + " si Telefonul:" + this.numarTelefon;
    }
}
