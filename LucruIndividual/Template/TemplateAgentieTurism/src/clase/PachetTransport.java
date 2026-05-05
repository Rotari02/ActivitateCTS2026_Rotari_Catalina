package clase;

public class PachetTransport extends PachetTuristic{
    public PachetTransport(int codPachet) {
        super(codPachet);
    }

    @Override
    public void cauzataCazare(int codPachet) {

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
