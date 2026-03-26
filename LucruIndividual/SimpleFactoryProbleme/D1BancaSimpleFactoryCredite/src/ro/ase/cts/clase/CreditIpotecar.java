package ro.ase.cts.clase;

public class CreditIpotecar extends ACredit {
    @Override
    public String getTip() {
       return "Credit Ipotecar";
    }

    @Override
    public void afisare() {
        System.out.println("Acetsa este un: "+getTip()+" pentru: "+getBeneficiar());
    }
}
