package farmacii;

import clase.Medicament;

public interface FabricaMedicamente {
    Medicament creazaMedicament(float pret, String denumire);
}
