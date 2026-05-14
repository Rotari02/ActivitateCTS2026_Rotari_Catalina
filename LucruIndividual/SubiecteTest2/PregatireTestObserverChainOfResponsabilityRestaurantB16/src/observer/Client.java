package observer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Client implements Observer{
    private String nume;
    private String email;
    private String telefon;

    public Client(String nume, String email, String telefon) {
        this.nume = nume;
        this.email = email;
        this.telefon = telefon;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    public String getNume() {
        return nume;
    }

    public String formateazData( )
    {
        LocalDateTime dataCurenta=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd MMMM yyyy. HH:mm");
        String dataFormata=dataCurenta.format(formatter);
        return dataFormata;
    }

    @Override
    public void primesteSMS(String sms) {
        System.out.println("["+formateazData()+"]"+this.nume+" tocmai ai primit urmatorul SMS:\n\t"+sms);
    }

    @Override
    public void primesteEmail(String email) {
        System.out.println("["+formateazData()+"]"+this.nume+" tocmai ai primit urmatorul email:\n\t"+email);
    }
}
