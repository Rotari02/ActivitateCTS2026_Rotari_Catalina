package clase;

public class Medicament implements IComponentaGrupare{
    private String denumire;
    private double pret;

    public Medicament(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void descriereComponenta(String aliniat) {
        System.out.println(aliniat+" Denumire medicament: "+this.denumire+" pret: "+this.pret+" RON.");
    }

    @Override
    public void adaugaComponenta(IComponentaGrupare coponenta) {
        throw new RuntimeException("Aceasta optiune nu este permisa!");
    }

    @Override
    public void stergeComponenta(IComponentaGrupare coponenta) {
        throw new RuntimeException("Aceasta optiune nu este permisa!");
    }
}
