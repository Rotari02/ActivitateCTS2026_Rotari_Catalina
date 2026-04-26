package SimpleFactory.FabricaMasini;

import SimpleFactory.clase.AMasina;
import SimpleFactory.clase.SUV;
import SimpleFactory.clase.Sedan;
import SimpleFactory.clase.VAN;

public class FabricaMasina {

    public AMasina creeazaMasina(TipMasina tip, String nrInmatriculare, String marca, double kilometraj) throws Exception {
        switch (tip) {
            case SEDAN:
                return new Sedan(nrInmatriculare, marca, kilometraj);
            case SUV:
                return new SUV(nrInmatriculare, marca, kilometraj);
            case VAN:
                return new VAN(nrInmatriculare, marca, kilometraj);
            default:
                return null;
        }
    }
}

