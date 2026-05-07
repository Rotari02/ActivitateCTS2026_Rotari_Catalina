package clase;

public class CompanieAeriana {
    private String numeCompanieAeriana;

    public CompanieAeriana(String numeCompanieAeriana) {
        this.numeCompanieAeriana = numeCompanieAeriana;
    }

    @Override
    public String toString() {
        return "Compania Aeriana [nume Companie Aeriana:" + numeCompanieAeriana + "]";
    }

    public Zbor rezervaBiletAvion(String plecare, String destinatie) {
        Zbor zbor = new Zbor(this, plecare, destinatie);
        return zbor;
    }
}
