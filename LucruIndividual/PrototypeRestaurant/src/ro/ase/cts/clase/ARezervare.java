package ro.ase.cts.clase;

public abstract class  ARezervare {
    protected String numeClient;
    protected int nrPersoane;
    protected String data;
    protected String ora;

    public ARezervare() {
        this.numeClient = "Anonim";
        this.nrPersoane = 2;
        this.data = "18/03/2026";
        this.ora = "05:00 p.m.";
    }

    public ARezervare(String numeClient, int nrPersoane, String data, String ora) {
        this.numeClient = numeClient;
        this.nrPersoane = nrPersoane;
        this.data = data;
        this.ora = ora;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public abstract void descriere();
    public  abstract ARezervare copiaza();

    @Override
    public String toString() {
        return "ARezervare{" +
                "numeClient='" + numeClient + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", data='" + data + '\'' +
                ", ora='" + ora + '\'' +
                '}';

    }
}
