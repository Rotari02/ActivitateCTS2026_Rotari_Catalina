package client;

public class ClientFidel implements Observer {
    private String numeClient;

    public ClientFidel(String numeCl) {
        this.numeClient = numeCl;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println(numeClient + " ai primit un nou mesaj: " + mesaj);
    }
}
