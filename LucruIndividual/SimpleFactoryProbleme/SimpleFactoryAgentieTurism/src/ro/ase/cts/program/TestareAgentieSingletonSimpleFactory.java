package ro.ase.cts.program;

import ro.ase.cts.clase.PachetTuristic;
import ro.ase.cts.fabrici.AgentieSingletonSimpleFactory;
import ro.ase.cts.fabrici.TipPachet;

public class TestareAgentieSingletonSimpleFactory {
    public static void main(String[] args) {
        AgentieSingletonSimpleFactory fabrica = AgentieSingletonSimpleFactory.getInstanta();
        PachetTuristic pachetTuristic =null;
        try {
            pachetTuristic =fabrica.crearePachet(TipPachet.PachetTransportSiCazare);
        } catch (Exception e) {
            e.printStackTrace();
        }

        pachetTuristic.descriere();
    }
}
