public class SalaBuilderV1 implements IBuilder {
    private Sala sala;

    public SalaBuilderV1() {
        sala = new Sala();
    }

    public SalaBuilderV1 setNrSala(int nrSala) {
        sala.setNrSala(nrSala);
        return this;
    }

    public SalaBuilderV1 setLuminaAprinsa(boolean luminaAprinsa) {
        sala.setLuminaAprina(luminaAprinsa);
        return this;
    }

    public SalaBuilderV1 setUsaDeschisa(boolean usaDeschisa) {
        sala.setUsaDeschisa(usaDeschisa);
        return this;
    }

    public SalaBuilderV1 setFilmDifuzat(String filmDifuzat) {
        sala.setFilmDifuzat(filmDifuzat);
        return this;
    }

    @Override
    public Sala build() {
        return sala;
    }
}
