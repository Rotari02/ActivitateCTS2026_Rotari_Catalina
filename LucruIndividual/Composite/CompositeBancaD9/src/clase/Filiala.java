package clase;

public class Filiala implements IUnitateBancara {
    private String denumire;
    private String adresa;

    public Filiala(String denumire, String adresa) {
        this.denumire = denumire;
        this.adresa = adresa;
    }

    @Override
    public void adaugaComponenta(IUnitateBancara unitateBancara) {
        throw new RuntimeException("Aceasta optiune nu este implimentata");
    }

    @Override
    public void stergeComponente(IUnitateBancara unitateBancara) {
        throw new RuntimeException("Aceasta optiune nu este implimentata");
    }

    @Override
    public void descriereStructura(String aliniat) {
        System.out.println(aliniat + " Filiala: " + this.denumire + " ,adresa:" + this.adresa);
    }
}
