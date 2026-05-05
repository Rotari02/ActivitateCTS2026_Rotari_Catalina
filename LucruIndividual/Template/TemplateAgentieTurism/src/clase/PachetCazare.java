package clase;

public class PachetCazare extends PachetTuristic{
    public PachetCazare(int codPachet) {
        super(codPachet);
    }

    @Override
    public void cauzataCazare(int codPachet) {
        System.out.println("Avem cazare pentru pachetul ce are codul "+codPachet);
    }

    @Override
    public void cautaTransport(int codPachet) {

    }

    @Override
    public void rezervaPachet(int codPachet) {
        System.out.println("S-a rezervat pachetul "+codPachet);
    }

    @Override
    public void achitaPachet(int codPachet) {
        System.out.println("S-a platit pachetul "+codPachet);
    }
}
