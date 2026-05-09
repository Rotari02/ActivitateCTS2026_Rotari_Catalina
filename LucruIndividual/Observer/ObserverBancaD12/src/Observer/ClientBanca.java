package Observer;

public class ClientBanca implements IObserverBanca {
    private String nume;

    public ClientBanca(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(this.nume + " ,ai primit urmatorul mesaj: " + mesaj);
    }
}
