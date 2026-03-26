package ro.ase.cts.fabrica;

import ro.ase.cts.clase.Medicament;
import ro.ase.cts.clase.MedicamentBody;
import ro.ase.cts.clase.MedicamentDurere;
import ro.ase.cts.clase.MedicamentRaceala;

public class FabricaMedicamente {
   private String denumireFabrica;

    public FabricaMedicamente(String denumireFabrica) {
        this.denumireFabrica = denumireFabrica;
    }

    public String getDenumireFabrica() {
        return denumireFabrica;
    }

    public Medicament creazaMedicament(TipMedicament tipMedicament, float pret, String denumire) {
        return switch (tipMedicament) {
            case BODY -> new MedicamentBody(pret, denumire);
            case DURERE -> new MedicamentDurere(pret, denumire);
            case RACEALA -> new MedicamentRaceala(pret, denumire);
            default -> null;
        };
    }
}
