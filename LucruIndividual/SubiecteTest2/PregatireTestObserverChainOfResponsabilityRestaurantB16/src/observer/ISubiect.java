package observer;

public interface ISubiect {
    void trimiteNotificare(String mesaj);
    void adaugaObservere(Observer observer);
    void stergeObservere(Observer observer);
}
