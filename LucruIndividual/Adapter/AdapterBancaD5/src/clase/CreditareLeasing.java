package clase;

public class CreditareLeasing {
    public void acordaCreditLeasing(String numeClient, double suma) {
        if (suma < 150000) {
            System.out.println("Clientul " + numeClient + " i se ofera un credit de leasing in suma de " + suma + " RON");
        } else {
            System.out.println("Suma de leasing este peste pragul admisibil. ");
        }
    }
}
