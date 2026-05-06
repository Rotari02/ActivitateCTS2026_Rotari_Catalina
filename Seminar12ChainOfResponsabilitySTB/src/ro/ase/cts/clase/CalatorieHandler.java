package ro.ase.cts.clase;

public abstract  class CalatorieHandler {
    protected CalatorieHandler calatorieHandler; //succescor

    public CalatorieHandler(){
        this.calatorieHandler=null;
    }

    public void setCalatorieHandler(CalatorieHandler calatorieHandler) {
        this.calatorieHandler = calatorieHandler;
    }

    public abstract String recomandareCalatorie(double distanta);
}
