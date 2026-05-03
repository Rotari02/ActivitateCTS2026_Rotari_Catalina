package ro.ase.cts.clase;

public class Autobuz implements MijlocDeTransport {
    private int nrPasageri;
    private int nrLinie;
    private TipCursa tipCursa;

    public Autobuz(int nrPasageri, int nrLinie, TipCursa tipCursa) {
        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
        this.tipCursa = tipCursa;
    }

    public Autobuz(int nrPasageri, int nrLinie) {
        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
        this.tipCursa = TipCursa.CursaNormala;
    }

    public int getNrPasageri() {
        return nrPasageri;
    }

    public TipCursa getTipCursa() {
        return tipCursa;
    }

    public void opresteInStatie(Statie statie) {
        System.out.println("Autobuzul de pe linia " + nrLinie + " a staționat in statia " + statie.getNumeStatie());
    }
}