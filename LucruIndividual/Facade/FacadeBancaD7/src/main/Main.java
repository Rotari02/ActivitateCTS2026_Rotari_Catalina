package main;

import clase.FacadeCreareCont;
import clase.PersoanaVerificare;

public class Main {
    public static void main(String[] args) {
        PersoanaVerificare persoana1 = new PersoanaVerificare("Popescu Ioana", 16,
                false, false);
        PersoanaVerificare persoana2 = new PersoanaVerificare("Popescu Vlad", 18,
                false, true);
        PersoanaVerificare persoana3 = new PersoanaVerificare("Popescu Ion", 40,
                true, false);
        PersoanaVerificare persoana4 = new PersoanaVerificare("Popescu Maria", 36,
                false, false);

        FacadeCreareCont facade = new FacadeCreareCont();
        facade.comunicareDecizieEligibilitate(persoana1);
        facade.comunicareDecizieEligibilitate(persoana2);
        facade.comunicareDecizieEligibilitate(persoana3);
        facade.comunicareDecizieEligibilitate(persoana4);
    }
}
