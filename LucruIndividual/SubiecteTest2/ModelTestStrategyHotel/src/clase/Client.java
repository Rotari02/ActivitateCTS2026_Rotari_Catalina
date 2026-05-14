package clase;

public class Client {
    private String nume;
    private  IVerificareActe tipVerificareActe;

    public Client(String nume, IVerificareActe tipVerificareActe) {
        this.nume = nume;
        this.tipVerificareActe = tipVerificareActe;
    }

    public void setTipVerificareActe(IVerificareActe tipVerificareActe) {
        this.tipVerificareActe = tipVerificareActe;
    }

    public void prezintaActe(){
        this.tipVerificareActe.verificaActe(this.nume);
    }
}
