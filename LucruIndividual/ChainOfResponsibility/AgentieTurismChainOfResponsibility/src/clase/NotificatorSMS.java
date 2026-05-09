package clase;

public class NotificatorSMS extends Notificator {
    @Override
    public void notifica(Client client, String mesaj) {
        if (client.getNrTelefon() != null) {
            System.out.println(client.getNumeClient() + " ai un SMS cu mesajul: " + mesaj);
        } else {
            super.getUrmatorulNotificator().notifica(client, mesaj);
        }
    }
}
