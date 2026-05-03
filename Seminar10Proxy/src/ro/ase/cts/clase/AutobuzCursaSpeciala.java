package ro.ase.cts.clase;

public class AutobuzCursaSpeciala implements MijlocDeTransport {
    private MijlocDeTransport mijlocDeTransport;

    public AutobuzCursaSpeciala(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if (this.mijlocDeTransport.getTipCursa() == TipCursa.CursaSpeciala) {
            System.out.println("Autobuzul este in cursa speciala, nu opreste in statiile STB!");
        } else {
            this.mijlocDeTransport.opresteInStatie(statie);
        }
    }

    @Override
    public int getNrPasageri() {
        return this.mijlocDeTransport.getNrPasageri();
    }

    @Override
    public TipCursa getTipCursa() {
        return this.mijlocDeTransport.getTipCursa();
    }
}
