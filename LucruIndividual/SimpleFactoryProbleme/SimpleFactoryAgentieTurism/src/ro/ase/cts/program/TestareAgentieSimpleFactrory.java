package ro.ase.cts.program;

import ro.ase.cts.clase.PachetTuristic;
import ro.ase.cts.fabrici.AgentieFactory;
import ro.ase.cts.fabrici.TipPachet;

public class TestareAgentieSimpleFactrory {
    public static void main(String[] args) throws Exception {
        AgentieFactory fabrica =new AgentieFactory();
        PachetTuristic pachetTuristic =null;
        try {
            pachetTuristic= fabrica.crearePachet(TipPachet.PachetCazare);
        } catch (Exception e) {
            e.printStackTrace();
        }
        pachetTuristic.descriere();
    }
}
