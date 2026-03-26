package ro.ase.cts.fabrici;

import ro.ase.cts.clase.PachetCazare;
import ro.ase.cts.clase.PachetCazareTransport;
import ro.ase.cts.clase.PachetTransport;
import ro.ase.cts.clase.PachetTuristic;

public class AgentieFactory {
    public PachetTuristic crearePachet(TipPachet tipPachet) throws  Exception {
        switch (tipPachet) {
            case PachetCazare:
                return new PachetCazare();
            case PachetTransport:
                return new PachetTransport();
            case PachetTransportSiCazare:
                return  new PachetCazareTransport();
            default:
                throw new Exception("Tipul primit nu este corect");
        }
    }
}
