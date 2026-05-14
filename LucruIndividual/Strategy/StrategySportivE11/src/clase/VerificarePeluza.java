package clase;

public class VerificarePeluza implements IVerificareSpectator{
    @Override
    public void verificaSpectator(Spectator spectator) {
        System.out.println("Verificare acces pe peluza: "+spectator.getNume()+" va rogam sa ne permiteti sa controlam bagajul si haina purtata");
    }
}
