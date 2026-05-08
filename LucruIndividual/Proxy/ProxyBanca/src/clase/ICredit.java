package clase;

public interface ICredit {
    void acordaCredit(String numeClient);

    double getSuma();

    Moneda getMoneda();
}