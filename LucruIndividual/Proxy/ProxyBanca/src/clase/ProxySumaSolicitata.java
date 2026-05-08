package clase;

public class ProxySumaSolicitata implements ICredit {
    private ICredit credit;

    public ProxySumaSolicitata(ICredit credit) {
        this.credit = credit;
    }

    @Override
    public void acordaCredit(String numeClient) {

        if (credit.getSuma() < 50000) {
            credit.acordaCredit(numeClient);
        } else {
            System.out.println("Solicitarea clientului "
                    + numeClient
                    + " a fost respinsa!");
            System.out.println("Nu putem acorda credite mai mari de 50000!");
        }
    }

    @Override
    public double getSuma() {
        return credit.getSuma();
    }

    @Override
    public Moneda getMoneda() {
        return credit.getMoneda();
    }

    public void setCredit(ICredit credit) {
        this.credit = credit;
    }
}