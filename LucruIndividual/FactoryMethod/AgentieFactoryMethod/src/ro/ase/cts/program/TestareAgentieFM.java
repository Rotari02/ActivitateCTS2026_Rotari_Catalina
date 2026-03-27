package ro.ase.cts.program;

import ro.ase.cts.clase.IPachetTuristic;
import ro.ase.cts.fabrici.*;

import javax.management.MBeanAttributeInfo;

public class TestareAgentieFM {
    public static void main(String[] args) {
        PachetTuristicFactory fabrica = new CazareFactory();
        PachetTuristicFactory fabricaTransport = new TransportFactory();

        IPachetTuristic pachet = fabrica.crearePachet(TipPachetCazare.CazareaCabana);
        pachet.afisareDescriere();
        pachet=fabricaTransport.crearePachet(TipPachetTransport.TransportMicrobuz);
        pachet.afisareDescriere();
    }
}

