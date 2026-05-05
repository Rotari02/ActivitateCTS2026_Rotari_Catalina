package clase;

public abstract class PachetTuristic {
    protected  int codPachet;

    public PachetTuristic(int codPachet) {
        super();
        this.codPachet = codPachet;
    }

    public abstract void cauzataCazare(int codPachet);
    public abstract void cautaTransport(int codPachet);
    public abstract void rezervaPachet(int codPachet);
    public abstract  void achitaPachet(int codPachet);

    public final void vindePachet(){
        cauzataCazare(codPachet);
        cautaTransport(codPachet);
        rezervaPachet(codPachet);
        achitaPachet(codPachet);
    }
}
