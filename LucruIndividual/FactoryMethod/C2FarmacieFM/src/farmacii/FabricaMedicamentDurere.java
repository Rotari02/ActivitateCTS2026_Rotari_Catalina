package farmacii;

import clase.Medicament;
import clase.MedicamentDurere;

public class FabricaMedicamentDurere implements FabricaMedicamente{
    @Override
    public Medicament creazaMedicament(float pret, String denumire) {
        return new MedicamentDurere(pret, denumire);
    }
}
