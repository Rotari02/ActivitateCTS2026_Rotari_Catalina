package clase;

public class Credit implements ICredit {
    private double suma;
    private Moneda moneda;

    public Credit(double suma, Moneda moneda) {
        this.suma = suma;
        this.moneda = moneda;
    }

    @Override
    public double getSuma() {
        return suma;
    }

    @Override
    public Moneda getMoneda() {
        return moneda;
    }

    @Override
    public void acordaCredit(String numeClient) {
        System.out.println("Solicitarea clientului " + numeClient
                + " pentru creditul in valoare de " + this.suma + " " + this.moneda + " a fost acceptata!");
    }
}
