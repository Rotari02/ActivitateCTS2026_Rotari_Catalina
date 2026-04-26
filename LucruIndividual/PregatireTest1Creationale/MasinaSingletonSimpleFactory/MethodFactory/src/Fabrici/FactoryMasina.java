package Fabrici;

import clase.AMasina;

public interface  FactoryMasina {
    AMasina creeazaMasina(String nrImatriculare, String marca, Double kilometraj) throws Exception;
}
