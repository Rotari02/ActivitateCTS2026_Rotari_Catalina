package clase;

public class VerificareTribune implements IVerificareSpectator{
    @Override
    public void verificaSpectator(Spectator spectator) {
        System.out.println("Verificare acces tribuna:  "+spectator.getNume()+" va rugam sa permiteti controlul bagajului!");
    }
}
