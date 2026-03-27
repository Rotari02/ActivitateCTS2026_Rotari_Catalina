package farmacii;

import clase.Medicament;
import clase.MedicamentBody;

public class FabricaMedicamentBody implements FabricaMedicamente{
    @Override
    public Medicament creazaMedicament(float pret, String denumire) {
        return new MedicamentBody(pret,denumire);
    }
}
