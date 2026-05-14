package clase;

public class DetaliiSpecificeCont {
    protected String nrCont;
    protected double sold;
    protected Moneda moneda;

    public DetaliiSpecificeCont(String nrCont, double sold, Moneda moneda) {
        this.nrCont = nrCont;
        this.sold = sold;
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DetaliiSpecificeCont{");
        sb.append("nrCont='").append(this.nrCont).append('\'');
        sb.append(", sold=").append(this.sold);
        sb.append(this.moneda);
        sb.append('}');
        return sb.toString();
    }
}
