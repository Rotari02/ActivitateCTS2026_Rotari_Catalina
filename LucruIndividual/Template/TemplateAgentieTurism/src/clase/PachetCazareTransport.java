package clase;

public class PachetCazareTransport extends PachetTuristic{

    public PachetCazareTransport(int codPachet) {
        super(codPachet);
    }

    @Override
    public void cauzataCazare(int codPachet) {
        System.out.println("Avem cazare pentru pachetul ce are codul "+codPachet);
    }

    @Override
    public void cautaTransport(int codPachet) {
        System.out.println("Avem transport pentru pachetul ce are codul "+codPachet);
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
