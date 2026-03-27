package fabrici;

import clase.APersonal;

public interface FactoryPersonal {
    APersonal creeazaPersonal(TipPersonal tip, String nume,
                              String prenume, int salariu, int aniVechime, String extra);

}
