package clase;

public class BiletSTB implements IBilet {
    private int nrCalatorii;

    public BiletSTB(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    public int getNrCalatorii() {
        return nrCalatorii;
    }

    @Override
    public void descriereBillet() {
        System.out.println("Bilet STB cu "+this.nrCalatorii+" calatorii ");
    }
}
