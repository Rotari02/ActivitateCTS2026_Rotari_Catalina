package ro.ase.cts.fabrici;

import ro.ase.cts.clase.*;

public class FabricaJucatori {
    public AJucator creeazaJucator(TipJucator tipJucator, String nume,
                                   boolean esteCapitanulEchipei, int nrTricou, int extra)
        throws IllegalArgumentException {
        return switch (tipJucator) {
            case FUNDAS -> new Fundas(nume,nrTricou,esteCapitanulEchipei,extra);
            case ATACANT -> new Atacant(nume,nrTricou,esteCapitanulEchipei,extra);
            case MIJLOCAS -> new Mijlocas(nume,nrTricou,esteCapitanulEchipei,extra);
            case PORTAR -> new Portar(nume,nrTricou,esteCapitanulEchipei,extra);
            default -> throw new IllegalArgumentException("Tipul de jucator "+tipJucator.toString().toUpperCase()+"nu exista!");
        };
    }
}
