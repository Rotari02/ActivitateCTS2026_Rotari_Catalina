package clase;

public class Client {
    private String nume;
    private IModVerificareActe modVerificareActe;

    public Client(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setModVerificareActe(IModVerificareActe modVerificareActe) {
        this.modVerificareActe = modVerificareActe;
    }

    public void perzintaActe() {
        this.modVerificareActe.procesareDocumente(this);
    }
}
