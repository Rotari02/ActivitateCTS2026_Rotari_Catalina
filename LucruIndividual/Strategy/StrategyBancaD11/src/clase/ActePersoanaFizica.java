package clase;

public class ActePersoanaFizica implements IModVerificareActe{
    @Override
    public void procesareDocumente(Client client) {
        System.out.println("Draga client " + client.getNume()
                + ", va rugam sa prezentati buletinul si adeverinta de salariat");
    }
}
