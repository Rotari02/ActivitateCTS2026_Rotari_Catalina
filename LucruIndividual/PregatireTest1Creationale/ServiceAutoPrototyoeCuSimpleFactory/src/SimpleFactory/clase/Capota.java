package SimpleFactory.clase;

public class Capota implements IComponenta{
   private String producator;
    @Override
    public void componentaDetalii() {
        System.out.println("Componenta este o CAPOTA");
    }
}
