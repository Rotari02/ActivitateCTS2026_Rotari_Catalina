package farmacii;

import clase.Medicament;
import clase.MedicamentRaceala;

public class FabricaMedicamentRaceala implements  FabricaMedicamente{
    @Override
    public Medicament creazaMedicament(float pret, String denumire) {
        return new MedicamentRaceala(pret, denumire);
    }
}
