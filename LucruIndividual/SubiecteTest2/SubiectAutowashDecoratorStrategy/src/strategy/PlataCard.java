package strategy;

public class PlataCard implements IModPlatesteStrategy{
    @Override
    public void plateste(double suma) {
        System.out.println("S-a realizat plata cu cardul pentru suma de " + suma + " RON.");
    }
}
