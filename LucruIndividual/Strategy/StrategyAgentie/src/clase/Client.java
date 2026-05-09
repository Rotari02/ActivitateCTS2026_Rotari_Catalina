package clase;

public class Client {
    private String nume;
    private IModPlata modPlata;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public Client(String nume) {
        super();
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public void plateste(double sumaDePlata) {
        modPlata.plateste(this.nume, sumaDePlata);
    }
}
