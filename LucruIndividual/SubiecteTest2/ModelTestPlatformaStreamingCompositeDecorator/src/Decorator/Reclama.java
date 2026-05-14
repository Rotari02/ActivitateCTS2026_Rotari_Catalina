package Decorator;

public class Reclama extends DecoratorClip{
    private double durata;
    private double momentRedare;
    private String titlu;

    public Reclama(IClip clipDecorat, double durata, double momentRedare, String titlu) {
        super(clipDecorat);
        this.durata = durata;
        this.momentRedare = momentRedare;
        this.titlu = titlu;
    }

    @Override
    public void redareReclama() {
        String durataReclamaString=String.format("%.2f",this.durata);
        String momemnteRedareString =String.format("%.2f",this.momentRedare);
        System.out.println("Reclama "+this.titlu+"cu durata de "+durataReclamaString+"min,  va fi redata la "+momemnteRedareString+" min.");
    }
}
