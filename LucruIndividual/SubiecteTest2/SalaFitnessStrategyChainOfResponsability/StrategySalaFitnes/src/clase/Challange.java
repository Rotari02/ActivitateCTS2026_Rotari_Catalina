package clase;

public class Challange implements IChallange{
   private IExercitiu exercitiu;
   private String numeAbonat;


    public Challange(String numeAbonat) {
        this.numeAbonat = numeAbonat;
    }

    @Override
    public void executaChallange() {
        System.out.println("Challange pentru "+this.numeAbonat);
        for(int i=0;i<5;i++){
            System.out.println("Exercitiul "+(i+1)+":");
            this.exercitiu.executaExercitiu();
        }
        System.out.println();
    }

    @Override
    public void setExercitiu(IExercitiu exercitiu) {
        this.exercitiu=exercitiu;
    }
}
