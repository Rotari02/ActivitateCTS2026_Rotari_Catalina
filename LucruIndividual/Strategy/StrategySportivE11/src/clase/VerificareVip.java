package clase;

public class VerificareVip implements IVerificareSpectator{
    @Override
    public void verificaSpectator(Spectator spectator) {
        System.out.println("Verificare acces zona vip: "+spectator.getNume()+" va rugam sa prezentati biletul! ");
    }
}
