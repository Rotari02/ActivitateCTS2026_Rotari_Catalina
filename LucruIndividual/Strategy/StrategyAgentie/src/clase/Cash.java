package clase;

public class Cash implements IModPlata {
    @Override
    public void plateste(String numeClient, double sumaDePlatit) {
        System.out.println(numeClient + " plateste cash suma in valoare de " + sumaDePlatit);
    }
}
