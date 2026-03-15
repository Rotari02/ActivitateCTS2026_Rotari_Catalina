package ro.ase.cts.lazy;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1= Hotel.getInstanta("Hotelul 1", 2,3);
        Hotel hotel2=Hotel.getInstanta("Hotel 2", 3,2);

        hotel1.afisareInchiriereCamera();
        hotel1.afisareInchiriereCamera();

        hotel2.afisareInchiriereCamera();
        hotel2.afisareInchiriereCamera();

      //  Hotel hotel3 = new Hotel(); --testare singleton, observam daca constructorul este privat

    }

}
