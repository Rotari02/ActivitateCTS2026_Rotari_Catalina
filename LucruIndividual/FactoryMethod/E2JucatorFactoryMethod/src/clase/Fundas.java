package clase;

import java.lang.ref.PhantomReference;

public class Fundas extends AJucator{
    private  int nrDeposedari;
    public Fundas(String nume, int nrTricou, boolean esteCapitanulEchipei, int nrDeposedari) {
        super(nume, nrTricou, esteCapitanulEchipei);
        this.nrDeposedari=nrDeposedari;
    }

    @Override
    public void descriereProfilJucator() {
        StringBuilder sb =new StringBuilder(this.informatiiGeneraleJucator());
        sb.append("\nPozitie in teren: FUNDAS")
                .append("\nNr deposedari: ").append(this.nrDeposedari).append("\n");
        System.out.println(sb.toString());
    }
}
