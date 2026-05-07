package inchiriereMasini;

public class Masina {
    private String model;
    private double capacitateCilindricaMotor;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCapacitateCilindricaMotor() {
        return capacitateCilindricaMotor;
    }

    public void setCapacitateCilindricaMotor(double capacitateCilindricaMotor) {
        this.capacitateCilindricaMotor = capacitateCilindricaMotor;
    }

    public Masina(String model, double capacitateCilindricaMotor) {
        this.model = model;
        this.capacitateCilindricaMotor = capacitateCilindricaMotor;
    }

    @Override
    public String toString() {
        return "Masina [model=" + model + " ,capacitateCilindricaModel=" + capacitateCilindricaMotor + "]";
    }
}
