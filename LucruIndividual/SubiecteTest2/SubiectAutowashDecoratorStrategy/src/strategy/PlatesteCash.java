package strategy;

public class PlatesteCash implements IModPlatesteStrategy{
    @Override
    public void plateste(double suma) {
        System.out.println("S-a realizat plata cash pentru suma de " + suma + " RON.");
    }
}
