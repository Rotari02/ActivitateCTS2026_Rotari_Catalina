package SimpleFactory.clase;


public class Sedan extends AMasina {
    public Sedan(String nrImatriculare, String marca, double kilometraj) throws Exception {
        super(nrImatriculare, marca, kilometraj);
    }

    @Override
    public void detaliiMasian() {
        descriereMasina();
        System.out.println("Tip masina: SEDAN\n");
    }


}
