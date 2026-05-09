package clase;

public class ActePersoanaJuridica implements IModVerificareActe {
    @Override
    public void procesareDocumente(Client client) {
        System.out.println("Draga client " + client.getNume()
                + ", va rugam sa prezentati  cererea de inregistrare la ONRC");
    }
}
