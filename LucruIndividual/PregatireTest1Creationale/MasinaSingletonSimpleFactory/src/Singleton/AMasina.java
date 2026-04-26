package Singleton;

public abstract class AMasina {
    private String nrImatriculare;
    private String marca;
    private double kilometraj;

    public AMasina(String nrImatriculare, String marca, double kilometraj) throws Exception{
        if(nrImatriculare.length()==7) {
            this.nrImatriculare = nrImatriculare;
        }else {
            throw  new Exception("Nr imatriculare invalid");
        }

        this.marca = marca;
        this.kilometraj = kilometraj;
    }

    public String getNrImatriculare() {
        return nrImatriculare;
    }

    public String getMarca() {
        return marca;
    }

    public double getKilometraj() {
        return kilometraj;
    }

    public abstract void detaliiMasina();

}
