package Singleton;

public class Masina extends AMasina{
    public Masina(String nrImatriculare, String marca, double kilometraj) throws Exception {
        super(nrImatriculare, marca, kilometraj);
    }

    @Override
    public void detaliiMasina() {
        StringBuilder sb =new StringBuilder("Autovehicolul: ");
        sb.append("\nNrImatriculare= ").append(this.getNrImatriculare());
        sb.append("\nMarca: ").append(this.getKilometraj());
        sb.append("\nKilometraj: ").append(this.getKilometraj()).append(" Kilometri");
        System.out.println(sb.toString());
    }
}
