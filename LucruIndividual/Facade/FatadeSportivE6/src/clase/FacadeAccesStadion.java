package clase;

import java.util.SplittableRandom;

public class FacadeAccesStadion {
    private SistemPolitie sistemPolitie=new SistemPolitie();
    private SistemAnticedente sistemAnticedente=new SistemAnticedente();
    private Persoana persoana;


    public void setPersoana(Persoana persoana) {
        this.persoana = persoana;
    }

    protected boolean verificaPermisiuneAccess(String serieBuletin){
        return  this.persoana.verificaIdentitate(serieBuletin)&&
                !this.sistemPolitie.esteUrmaritDePolitie(this.persoana)&&
                !this.sistemAnticedente.areAntecedente(this.persoana);
    }

    public void permiteAccesIntrare(String serieBuletin, String codBilet){
        if(verificaPermisiuneAccess(serieBuletin)){
            System.out.println("Dl./Dna. "+persoana.nume+" cu seria de buletin: "+serieBuletin+" si biletul "+codBilet+" poate intra pe stadion");
        }else{
            System.out.println("Dl./Dna. "+persoana.nume+" NU poate intra pe stadion pentru ca: ");
            if(!this.persoana.verificaIdentitate(serieBuletin))
            {
                System.out.println("\t - nu poate fi identificata pe baza seriei de buletin de pe bilet.");
            }
             if(this.sistemPolitie.esteUrmaritDePolitie(this.persoana)) {
                System.out.println("\t -este cautat/cautata de politie");
            }
             if(this.sistemAnticedente.areAntecedente(this.persoana)){
                System.out.println("\t- are antecedente pe alte stadioane");
            }
        }
        System.out.println();
    }
}
