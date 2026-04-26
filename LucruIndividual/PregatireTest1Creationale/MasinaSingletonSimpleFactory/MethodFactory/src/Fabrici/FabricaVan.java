package Fabrici;

import clase.AMasina;
import clase.VAN;

public class FabricaVan  implements FactoryMasina{
    @Override
    public AMasina creeazaMasina(String nrImatriculare, String marca, Double kilometraj) throws Exception {
        return new VAN(nrImatriculare,marca,kilometraj);
    }
}
