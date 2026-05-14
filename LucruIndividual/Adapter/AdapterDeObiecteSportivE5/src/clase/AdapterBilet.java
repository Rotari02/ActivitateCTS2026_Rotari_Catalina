package clase;

public class AdapterBilet implements IBilet {
    private EBiletRo bilet;

    public AdapterBilet(EBiletRo bilet) {
        this.bilet = bilet;
    }

    @Override
    public void rezervaBilet(String meci, String data) {
        this.bilet.rezervaBiletOnline(meci, data);
    }

    @Override
    public void vindeBilet(String meci, String data) {
        this.bilet.vindeBiletOnline(meci, data);
    }
}
