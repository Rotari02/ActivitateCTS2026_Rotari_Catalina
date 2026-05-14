package adapterDeObiecte;

public class BicicleteElectrica {
    private String model;

    public BicicleteElectrica(String model) {
        this.model = model;
    }

    public void inchiriazaBicicleta() {
        System.out.println("Bicicleta electrica " + model + " a fost inchiriata.");
    }

    public void achitaCursa() {
        System.out.println("Cursa pentru bicicleta " + model + " a fost achitata.");
    }


    @Override
    public String toString() {
        return "[Bicicleta electrica: [model: "+model+"]";
    }
}
