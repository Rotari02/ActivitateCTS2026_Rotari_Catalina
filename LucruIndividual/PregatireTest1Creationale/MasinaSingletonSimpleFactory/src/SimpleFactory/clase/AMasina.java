package SimpleFactory.clase;

public abstract class AMasina {
    private String nrImatriculare;
    private String marca;
    private double kilometraj;

    public AMasina(String nrImatriculare, String marca,double kilometraj) throws  Exception {
        if(nrImatriculare.length() ==7) {
            this.nrImatriculare = nrImatriculare;
        } else {
            throw new Exception("nr de inmatriculare invalid");
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

    public void descriereMasina() {
        StringBuilder sb=new StringBuilder("\nMasina: ");
        sb.append("Nr.Imatriculare: ").append(this.getNrImatriculare());
        sb.append("Marca: ").append(this.getMarca());
        sb.append("Kilometraj: ").append(this.getKilometraj()).append(" km.").append("\n");
        System.out.println(sb.toString());
    }

    public abstract void detaliiMasian();
}
