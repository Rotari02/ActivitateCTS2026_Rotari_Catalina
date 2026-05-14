package clase;

public class RecomandaMetrou extends Handler{

    @Override
    public void recomandareMijlodDeTransport(int distanta) {
        System.out.println("Pentru distanta de " + distanta + " km, circulati cu metroul!");
    }
}
