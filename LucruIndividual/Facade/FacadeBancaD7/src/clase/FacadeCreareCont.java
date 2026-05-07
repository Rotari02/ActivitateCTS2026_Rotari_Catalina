package clase;

public class FacadeCreareCont {
    private CreanteVerificare verificareCreante = new CreanteVerificare();
    private PolitieVerificare verificarePolitie = new PolitieVerificare();

    protected boolean verificareEligibilitateDeschidereCont(PersoanaVerificare persoana) {
        return persoana.varsta >= 18
                && !this.verificareCreante.areCreanteLaAlteBanci(persoana)
                && !this.verificarePolitie.esteUrmaritaDePolitie(persoana);
    }

    public void comunicareDecizieEligibilitate(PersoanaVerificare persoana) {
        if (verificareEligibilitateDeschidereCont(persoana)) {
            System.out.println("Dl./Dna. " + persoana.nume + " in varsta de " + persoana.varsta
                    + " ani este eligibil/eligibila pentru deschiderea contului!");
        } else {
            System.out.println("Dl./Dna. " + persoana.nume + " in varsta de " + persoana.varsta
                    + " ani NU este eligibil/eligibila pentru deschiderea contului, deoarece: ");

            if (persoana.varsta < 18) {
                System.out.println("\t - este minor/minora (varsta: " + persoana.varsta + " ani)");
            }

            if (this.verificarePolitie.esteUrmaritaDePolitie(persoana)) {
                System.out.println("\t - este urmarit/urmarita de politie");
            }

            if (this.verificareCreante.areCreanteLaAlteBanci(persoana)) {
                System.out.println("\t - are creante la alte banci");
            }
        }
        System.out.println();
    }
}
