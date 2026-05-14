package clase;


public class Antrenor extends HandlerAccidentare{
    @Override
    public void trateazaAccidentarea(FisaAcidentare accidentare) {
        System.out.println("Antrenorul verifica situatia...");
        if (accidentare != null) {
            if (this.getSuccesor() != null) {
                this.getSuccesor().trateazaAccidentarea(accidentare);
            } else {
                System.out.println("Nu avem asistent medical care sa trateze accidentarea!");
            }
        } else {
            System.out.println("Alarma falsa! Nu e vorba de nicio accidentare!");
        }
    }
}
