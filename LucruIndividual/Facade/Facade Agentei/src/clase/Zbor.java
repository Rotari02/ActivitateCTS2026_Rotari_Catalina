package clase;

public class Zbor {
    private CompanieAeriana companieAeriana;
    private String orasPlecare;
    private String destinatie;

    public Zbor(CompanieAeriana companieAeriana, String orasPlecare, String destinatie) {
        super();
        this.companieAeriana = companieAeriana;
        this.orasPlecare = orasPlecare;
        this.destinatie = destinatie;
    }

    public CompanieAeriana getCompanieAeriana() {
        return companieAeriana;
    }

    public void setCompanieAeriana(CompanieAeriana companieAeriana) {
        this.companieAeriana = companieAeriana;
    }

    public String getOrasPlecare() {
        return orasPlecare;
    }

    public void setOrasPlecare(String orasPlecare) {
        this.orasPlecare = orasPlecare;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    @Override
    public String toString() {
        return "Zbor [companie Aeriana:" + companieAeriana + ", oras Plecare:" + orasPlecare + ", destinatie:" + destinatie + "]";
    }
}
