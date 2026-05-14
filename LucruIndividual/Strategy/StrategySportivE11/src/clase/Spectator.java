package clase;

public class Spectator {
    private String nume;
    private IVerificareSpectator tipVerificare;

    public Spectator(String nume) {
        this.nume = nume;
    }

    public void setTipVerificare(IVerificareSpectator tipVerificare) {
        this.tipVerificare = tipVerificare;
    }

    public String getNume() {
        return nume;
    }

    public void controlAcces(){
        this.tipVerificare.verificaSpectator(this);
    }
}

