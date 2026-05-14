package clase;

public class Banca {
    protected String denumire;
    protected String sucursala;
    protected double capital;

    public Banca(String denumire, String sucursala, double capital) {
        this.denumire = denumire;
        this.sucursala = sucursala;
        this.capital = capital;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Banca{");
        sb.append("denumire='").append(this.denumire).append('\'');
        sb.append(", sucursala='").append(this.sucursala).append('\'');
        sb.append(", capital=").append(this.capital);
        sb.append('}');
        return sb.toString();
    }
}
