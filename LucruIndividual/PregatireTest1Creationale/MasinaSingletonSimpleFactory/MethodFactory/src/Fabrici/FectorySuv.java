package Fabrici;

import clase.AMasina;
import clase.SUV;

public class FectorySuv implements  FactoryMasina{
    @Override
    public AMasina creeazaMasina(String nrImatriculare, String marca, Double kilometraj) throws Exception {
        return new SUV(nrImatriculare,marca,kilometraj);
    }
}
