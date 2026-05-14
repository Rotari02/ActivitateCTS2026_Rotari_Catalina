package adapterDeObiecte;

public class AdapterBicicleta implements IPachetTuristic{
   private BicicleteElectrica bicicletaElectrica;

    public AdapterBicicleta(BicicleteElectrica bicicletaElectrica) {
        this.bicicletaElectrica = bicicletaElectrica;
    }

    @Override
    public void descrierePachet() {
        System.out.println(bicicletaElectrica.toString());
    }

    @Override
    public void rezervaPachet() {
        bicicletaElectrica.inchiriazaBicicleta();
    }

    @Override
    public void vindePachet() {
            bicicletaElectrica.achitaCursa();
    }


}
