package clase;

public class FisaAcidentare {
    private String numeCursant;
    private TipGravitateAccidentare gravitate;

    public FisaAcidentare(String numeCursant, TipGravitateAccidentare gravitate) {
        this.numeCursant = numeCursant;
        this.gravitate = gravitate;
    }

    public String getNumeCursant() {
        return numeCursant;
    }

    public TipGravitateAccidentare getGravitate() {
        return gravitate;
    }
}
