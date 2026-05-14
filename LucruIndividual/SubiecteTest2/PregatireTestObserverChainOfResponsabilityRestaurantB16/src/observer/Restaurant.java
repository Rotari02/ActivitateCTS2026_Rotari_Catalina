package observer;

import chain.NotificatorEmail;
import chain.NotificatorHandler;
import chain.NotificatorManager;
import chain.NotificatorSms;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements ISubiect{
    private List<Observer> clientiFideli;

    public Restaurant() {
        this.clientiFideli = new ArrayList<>();
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        NotificatorHandler notificatorSms=new NotificatorSms();
        NotificatorHandler notificatorEmail=new NotificatorEmail();
        NotificatorHandler notificatorManager=new NotificatorManager();

        notificatorSms.setSuccesor(notificatorEmail);
        notificatorEmail.setSuccesor(notificatorManager);

        for(Observer observer:clientiFideli){
            notificatorSms.notifica((Client) observer,mesaj);
        }
    }

    @Override
    public void adaugaObservere(Observer observer) {
        this.clientiFideli.add(observer);
    }

    @Override
    public void stergeObservere(Observer observer) {
        this.clientiFideli.remove(observer);
    }
}
