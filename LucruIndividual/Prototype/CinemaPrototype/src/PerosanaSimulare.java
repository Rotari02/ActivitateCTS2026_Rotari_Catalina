public class PerosanaSimulare implements IPersoanaSimulare{
   private String nume;
   private int varsta;
   private String cnp;

    public PerosanaSimulare()
    {
        this.nume="Miron Petru";
        this.varsta=20;
        this.cnp="100000000000";
    }

    public PerosanaSimulare(String nume, int varsta, String cnp) {
        super(); //atentie
        this.nume = nume;
        this.varsta = varsta;
        this.cnp = cnp;
    }

    @Override
    public String toString() {
       return "Persoana Simulare [nume="+nume+", varsta="+varsta+", cnp="+cnp+"]";
    }

    @Override
    public IPersoanaSimulare duplica() {
        try{
            return (IPersoanaSimulare) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }
}
