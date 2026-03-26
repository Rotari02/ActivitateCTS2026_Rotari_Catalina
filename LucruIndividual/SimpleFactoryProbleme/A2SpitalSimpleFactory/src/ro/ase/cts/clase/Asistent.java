package ro.ase.cts.clase;

import java.util.Locale;

public class Asistent extends Personal{

    public Asistent(String nume, String prenume, int salariu, int aniVechime) {
        super(nume, prenume, salariu, aniVechime);
    }

    @Override
    public void desciereProfilAngajat() {
        StringBuilder builder = new StringBuilder(this.getNumeComplet().toUpperCase());
        builder.append("\n").append("FUNCTIE: asistent").append("\n")
                .append("SALARIUL: ").append(this.getSalariu()).append(" RON").append("\n")
                .append("ANGAJAT DIN ANUL: ").append(this.getAnAngajare()).append(" (")
                .append(this.getAniVechime()).append(" ani vechime)").append("\n");
        System.out.println(builder.toString());
    }
}
