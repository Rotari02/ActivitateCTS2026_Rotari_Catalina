//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FabricaSport fabricaFotbal =new FabricaFotbal();
        FabricaSport fabricaHandbal =new FabricaHandbal();

        Sport fotbalMasculin=fabricaFotbal.creareMeci(TipFotbal.FOTBALMASCULIN,"Romania","Argentina");

        fotbalMasculin.detaliiMeci();

    }
}