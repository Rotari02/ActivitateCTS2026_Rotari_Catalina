package clase;

public class PachetCazare implements PachetTuristic {
    @Override
    public void desciere() {
        System.out.println("Acest pachet are doar cazare");
    }

    @Override
    public void rezervaPachet() {
        System.out.println("A fost realizata o rezervare de cazare");
    }
}
