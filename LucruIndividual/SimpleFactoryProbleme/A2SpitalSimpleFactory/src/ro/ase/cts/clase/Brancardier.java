package ro.ase.cts.clase;

public class Brancardier extends Personal{
    public Brancardier(String nume, String prenume, int salariu, int aniVechime) {
        super(nume, prenume, salariu, aniVechime);
    }

    @Override
    public void desciereProfilAngajat() {
        StringBuilder builder = new StringBuilder(this.getNumeComplet().toUpperCase());
        builder.append("\n").append("FUNCTIE: brancardier").append("\n")
                .append("SALARIUL: ").append(this.getSalariu()).append(" RON").append("\n")
                .append("ANGAJAT DIN ANUL: ").append(this.getAnAngajare()).append(" (")
                .append(this.getAniVechime()).append(" ani vechime)").append("\n");
        System.out.println(builder.toString());

    }
}
