package clase;

public class ProxyMoneda implements ICredit {
    private ICredit credit;

    public ProxyMoneda(ICredit credit) {
        this.credit = credit;
    }

    @Override
    public void acordaCredit(String numeClient) {
        if (credit.getMoneda() == Moneda.RON) {
            credit.acordaCredit(numeClient);
        } else {
            System.out.println("Solicitarea clientului "
                    + numeClient
                    + " a fost respinsa!");
            System.out.println("Momentan se acorda credite doar in RON!");
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
