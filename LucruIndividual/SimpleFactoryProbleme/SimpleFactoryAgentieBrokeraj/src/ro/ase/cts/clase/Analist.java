package ro.ase.cts.clase;

public class Analist extends IAngajat{
    @Override
    public String getTip() {
        return "Analist";
    }

    @Override
    public void afisare(String nume) {
        System.out.println("Analist: "+nume);
    }
}
