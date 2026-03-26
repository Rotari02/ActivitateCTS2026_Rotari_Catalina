package ro.ase.cts.clase;

public class CreditNevoiPersonale extends ACredit{
    @Override
    public String getTip() {
        return "Credit de Nevoi Personale";
    }

    @Override
    public void afisare() {
        System.out.println("Acesta este un "+getTip()+" pentru: "+getBeneficiar());
    }
}
