package SimpleFactory.clase;

public class VAN extends AMasina {
    public VAN(String nrImatriculare, String marca, double kilometraj) throws Exception {
        super(nrImatriculare, marca, kilometraj);
    }

    @Override
    public void detaliiMasian() {
        descriereMasina();
        System.out.println("Tip masina: VAN\n");
    }
}
