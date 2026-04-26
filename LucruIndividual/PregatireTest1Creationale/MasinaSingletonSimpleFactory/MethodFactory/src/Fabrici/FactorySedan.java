package Fabrici;

import clase.AMasina;
import clase.Sedan;

public class FactorySedan implements  FactoryMasina{
    @Override
    public AMasina creeazaMasina(String nrImatriculare, String marca, Double kilometraj) throws Exception {
        return new Sedan(nrImatriculare,marca,kilometraj);
    }
}
