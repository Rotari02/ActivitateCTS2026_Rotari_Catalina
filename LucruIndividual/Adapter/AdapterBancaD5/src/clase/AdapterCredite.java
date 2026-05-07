package clase;

public class AdapterCredite implements ICreditare {
    private CreditareLeasing creditareLeasing;

    public AdapterCredite(CreditareLeasing creditareLeasing) {
        this.creditareLeasing = creditareLeasing;
    }

    @Override
    public void acordaCredit(String numeClient, double suma) {
        this.creditareLeasing.acordaCreditLeasing(numeClient, suma);
    }
}
