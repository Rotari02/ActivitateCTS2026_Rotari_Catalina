package fabrici;

import clase.AJucator;
import clase.Fundas;

public class FabricaFundasi implements FabricaJucatori{
    private  int nrDeposedari;

    public FabricaFundasi(int nrDeposedari) {
        this.nrDeposedari = nrDeposedari;
    }

    public void setNrDeposedari(int nrDeposedari) {
        this.nrDeposedari = nrDeposedari;
    }

    @Override
    public AJucator creeazaJucator(String nume, int nrTricou, boolean esteCapitanulEchipei) {
        return new Fundas(nume,nrTricou,esteCapitanulEchipei,nrDeposedari);
    }
}
