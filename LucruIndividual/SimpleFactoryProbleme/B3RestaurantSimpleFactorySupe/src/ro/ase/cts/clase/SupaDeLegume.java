package ro.ase.cts.clase;

public class SupaDeLegume  extends ASupa{
    @Override
    public String getTip() {
        return "Supa de Legume";
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Se serveste: "+getTip()+" - "+getNume());
    }
}
