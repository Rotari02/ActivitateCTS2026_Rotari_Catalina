package SimpleFactory.clase;

public class Usa implements  IComponenta{
    private String producator;
    @Override
    public void componentaDetalii() {
        System.out.println("Componenta este o USA");
    }
}
