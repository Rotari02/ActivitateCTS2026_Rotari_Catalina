package program;

import clase.APersonal;
import fabrici.*;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal fabricaPersonalMedical =new FactoryPersonalMedical();
        FactoryPersonal factoryPersonalNonMedical = new FactoryPersonalNonMedical();

        APersonal registrator = factoryPersonalNonMedical.creeazaPersonal(TipPersonalNonMedical.REGISTRATOR,"Volmir","Ana",3500,2,null);
        APersonal medic = fabricaPersonalMedical.creeazaPersonal(TipPersonalMedical.MEDIC,"Petrascu","Miron", 7000,3,"Pediatru");

        registrator.descriereProfilAngajare();
        System.out.println("");
        medic.descriereProfilAngajare();
    }
}
