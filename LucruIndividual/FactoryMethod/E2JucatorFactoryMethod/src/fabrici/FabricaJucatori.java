package fabrici;

import clase.AJucator;

public interface FabricaJucatori {
    public AJucator creeazaJucator(String nume, int nrTricou, boolean esteCapitanulEchipei);
}
