package Subiect;

import Observer.IObserverBanca;

public interface ISubiectBanca {
    void adaugaObserver(IObserverBanca observer);

    void stergeObserver(IObserverBanca observer);

    void trimiteNotificare(String mesaj);
}
