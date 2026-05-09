package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Notificator notificatorSMS = new NotificatorSMS();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManager = new NotificatorManager();

        notificatorSMS.setUrmatorulNotificator(notificatorEmail);
        notificatorEmail.setUrmatorulNotificator(notificatorManager);

        Client client1 = new Client("Rotari", null, null);
        notificatorSMS.notifica(client1, "Notificare de test ");

        Client client2 = new Client("Avramescu", null, "avramescu@gmail.com");
        notificatorSMS.notifica(client2, "Ati primit o reducere de 25%");
    }
}
