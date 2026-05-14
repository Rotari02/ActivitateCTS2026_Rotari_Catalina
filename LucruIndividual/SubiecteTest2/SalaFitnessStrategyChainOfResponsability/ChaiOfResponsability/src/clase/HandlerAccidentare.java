package clase;

public abstract class HandlerAccidentare {
    private  HandlerAccidentare succesor;

    public HandlerAccidentare getSuccesor() {
        return succesor;
    }

    public void setSuccesor(HandlerAccidentare succesor) {
        this.succesor = succesor;
    }

    public abstract void trateazaAccidentarea(FisaAcidentare accidentare);
}
