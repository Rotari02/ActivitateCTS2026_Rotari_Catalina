package ro.ase.cts.program;


import ro.ase.cts.clase.ClientAbstract;
import ro.ase.cts.clase.RegistruClienti;
import ro.ase.cts.clase.Rezervare;

public class TestareFlyway {
    public static void main(String[] args) {
        RegistruClienti registru = new RegistruClienti();
        ClientAbstract client1 = registru.getClient("Catalina", "094567435", "cata@mail.com");
        ClientAbstract client2 = registru.getClient("Vlad", "0235457873", "vlad@gmail.com");
        Rezervare rezervare1 = new Rezervare(10, "18:50", 3);
        client1.printeazaRezervare(rezervare1);
        Rezervare rezervare2 = new Rezervare(12, "12:00", 15);
        client1.printeazaRezervare(rezervare2);
        registru.getClient("Vlad", "0235457873", "vlad@gmail.com").printeazaRezervare(rezervare2);
        registru.getClient("Vlad", "0235457873", "vlad@gmail.com").plateste(rezervare2, 105.70);
        Rezervare rezervare3 = new Rezervare(15, "19:00", 6);
        registru.getClient("Catalina", "094567435", "cata@mail.com").printeazaRezervare(rezervare3);
        registru.getClient("Catalina", "094567435", "cata@mail.com").plateste(rezervare3, 98.50);
    }
}