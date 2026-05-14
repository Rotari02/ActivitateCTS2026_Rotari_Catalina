package clase;

public interface SubiectObservabil {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void notificaObserveri(Meci meci);
}
