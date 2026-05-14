package strategy;

public class PlatesteTelefon implements IModPlatesteStrategy{
    @Override
    public void plateste(double suma) {
        System.out.println("S-a realizat plata telefon "+ suma+" RON");
    }
}
