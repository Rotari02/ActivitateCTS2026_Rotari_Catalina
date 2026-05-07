package clase;

public class CreditareStandard implements ICreditare {
    @Override
    public void acordaCredit(String numeClient, double suma) {
        System.out.println("Clientul " + numeClient + " i se ofera un credit in suma de " + suma + " RON");
    }
}
