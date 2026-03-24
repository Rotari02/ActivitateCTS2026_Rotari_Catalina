package ro.ase.cts.AgentieSingletonLazyInitialization;

public class AgentieLazy {
    private String numeAgentie;
    private int nrPacheteVandute;

    private static AgentieLazy instanta = null;  //instanta unica-lazy initialization

    //constructor privat
    private AgentieLazy(String numeAgentie) throws Exception {
        if (instanta != null) {
            throw new Exception("Instanta deja creata");
        }
        this.numeAgentie = numeAgentie;
        this.nrPacheteVandute = 0;
    }

    //metoda lazy
    public static AgentieLazy getInstance(String numeAgentie) throws Exception {
        if (instanta == null) {
            instanta = new AgentieLazy(numeAgentie);
        }
        return instanta;
    }

    //vanzare pachete
    public void vindePachet() {
        nrPacheteVandute++;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public int getNrPacheteVandute() {
        return nrPacheteVandute;
    }
}
