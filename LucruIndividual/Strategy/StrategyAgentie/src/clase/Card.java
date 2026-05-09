package clase;

public class Card implements IModPlata {
    @Override
    public void plateste(String numeClient, double sumaDePlatit) {
        System.out.println(numeClient + " plateste card suma in valoare de " + sumaDePlatit);
    }
}
