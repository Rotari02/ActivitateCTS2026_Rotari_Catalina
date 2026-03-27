package fabrici;

import clase.APersonal;
import clase.Asistent;
import clase.Brancardier;
import clase.Medic;

public class FactoryPersonalMedical implements FactoryPersonal{
    @Override
    public APersonal creeazaPersonal(TipPersonal tip, String nume, String prenume, int salariu, int aniVechime, String extra) {
        if(!(tip instanceof TipPersonal)){
            throw new IllegalArgumentException("Tip incorect pt personal");
        }

        return switch ((TipPersonalMedical) tip) {
            case MEDIC -> new Medic(nume,prenume,salariu,aniVechime,extra);
            case ASISTENT -> new Asistent(nume,prenume,salariu,aniVechime);
            case BRANCARDIER -> new Brancardier(nume,prenume,salariu,aniVechime);
            default -> null;
        };
    }
}
