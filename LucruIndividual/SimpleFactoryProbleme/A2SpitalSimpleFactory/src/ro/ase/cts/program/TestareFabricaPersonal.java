package ro.ase.cts.program;

import ro.ase.cts.clase.Personal;
import ro.ase.cts.fabrica.FabricaPersonal;
import ro.ase.cts.fabrica.TipPersonal;

public class TestareFabricaPersonal {
    public static void main(String[] args) {
        FabricaPersonal fabrica = new FabricaPersonal();

        Personal asistent1= fabrica.createPersonal(TipPersonal.ASISTENT,"Marinescu","Ana",4000,5,null );
        Personal asistent2= fabrica.createPersonal(TipPersonal.ASISTENT,"Iliescu","Oana",5000,7,null );
        Personal brancardier1 =fabrica.createPersonal(TipPersonal.BRANCARDIER,"Varzari","Ion", 6000, 8,null);
        Personal medic1=fabrica.createPersonal(TipPersonal.MEDIC,"Petre","Ion", 7000,5,"ortoped");
        Personal medic2=fabrica.createPersonal(TipPersonal.MEDIC,"Petre","Maria", 10000,9,"chirurg");

        asistent1.desciereProfilAngajat();
        asistent2.desciereProfilAngajat();
        brancardier1.desciereProfilAngajat();
        medic1.desciereProfilAngajat();
        medic2.desciereProfilAngajat();
    }




}
