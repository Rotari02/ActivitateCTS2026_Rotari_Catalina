package clase;

public class ProxyPachet implements IPachetTuristic {

    private PachetTransport pachetTransport;

    public ProxyPachet(PachetTransport pachetTransport) {
        this.pachetTransport = pachetTransport;
    }

    public ProxyPachet(Persoana persoana) {
        this.pachetTransport = new PachetTransport(persoana);
    }

    @Override
    public void descriere() {
        pachetTransport.descriere();
    }

    @Override
    public void rezervaPachet() {
        if (pachetTransport.getPersoana().getVarsta() >= 65) {
            pachetTransport.rezervaPachet();
        } else {
            System.out.println("Rezervarea nu este permisa, deoarece " + pachetTransport.getPersoana().getNume() + " are doar "
                    + pachetTransport.getPersoana().getVarsta() + " ani");
        }
    }
}
