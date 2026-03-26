package ro.ase.cts.clase;

public class Vanzator extends IAngajat{
    @Override
    public String getTip() {
        return "Vanzator";
    }

    @Override
    public void afisare(String nume) {
        System.out.println("Vanzator: "+nume);
    }
}
