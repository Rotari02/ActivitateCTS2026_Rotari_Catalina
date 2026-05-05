package clase;

public class NotificatorManager extends Notificator {
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Stimate Manager, agentia nu are datele de contact pentru clientul: "+client.getNumeClient());
    }
}
