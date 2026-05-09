package clase;

public class PayPal implements IModPlata {
    @Override
    public void plateste(String numeClient, double sumaDePlatit) {
        System.out.println(numeClient + " plateste PayPal suma in valoare de " + sumaDePlatit);
    }
}
