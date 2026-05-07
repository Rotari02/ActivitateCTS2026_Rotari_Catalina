package clase;

import inchiriereMasini.MasinaInchiriata;

public class PachetMasinaInchiriataAdapter implements PachetTuristic {
    private MasinaInchiriata masinaInchiriata;

    public PachetMasinaInchiriataAdapter(MasinaInchiriata masinaInchiriata) {
        this.masinaInchiriata = masinaInchiriata;
    }

    @Override
    public void desciere() {
        System.out.println(this.masinaInchiriata.toString());
    }

    @Override
    public void rezervaPachet() {
        this.masinaInchiriata.inchiriazaMasina();
    }
}
