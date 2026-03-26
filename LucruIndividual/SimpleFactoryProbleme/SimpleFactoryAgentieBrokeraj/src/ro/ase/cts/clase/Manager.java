package ro.ase.cts.clase;

public class Manager extends IAngajat{
    @Override
    public String getTip() {
        return "Manager";
    }

    @Override
    public void afisare(String nume) {
        System.out.println("Manager: "+nume);
    }
}
