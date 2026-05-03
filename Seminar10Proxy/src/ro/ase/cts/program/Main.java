package ro.ase.cts.program;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport autobuz61 = new Autobuz(40, 61);
        MijlocDeTransport autobuz89 = new Autobuz(0, 89);

        Statie statieUnirii = new Statie("Piata Unirii", 15);
        Statie statieVictoriei = new Statie("Piata Victoriei", 0);

        autobuz61.opresteInStatie(statieUnirii);
        autobuz89.opresteInStatie(statieVictoriei);

        System.out.println("________Autobuze__Nocturne_____________________________________");

        MijlocDeTransport autoNoapte61 = new AutobuzNocturn(autobuz61);
        MijlocDeTransport autoNoapte89 = new AutobuzNocturn(autobuz89);

        autoNoapte61.opresteInStatie(statieUnirii);
        autoNoapte89.opresteInStatie(statieVictoriei);

        MijlocDeTransport autobuz = new Autobuz(20, 8, TipCursa.CursaSpeciala);

        System.out.println("-------Autobuze_________Special------------------------------");

        MijlocDeTransport autobuzSpecial = new AutobuzCursaSpeciala(autobuz);
        MijlocDeTransport autobuzSpecial61 = new AutobuzCursaSpeciala(autobuz61);

        autobuzSpecial.opresteInStatie(statieUnirii);
        autobuzSpecial61.opresteInStatie(statieVictoriei);
    }
}
