package clase;

public class Main {
    public static void main(String[] args) {
        IExercitiu flotari = new Flotari();
        IExercitiu fandari = new Fandari();
        IExercitiu salturi = new Salturi();
        IExercitiu genuflexiuni = new Genoflexiuni();

        IChallange ch1=new Challange("Ana");
        IChallange ch2=new Challange("Marin");

        ch1.setExercitiu(fandari);
        ch1.executaChallange();
        ch1.setExercitiu(flotari);
        ch1.executaChallange();

        System.out.println("---------------");
        ch2.setExercitiu(salturi);
        ch2.executaChallange();
        ch2.setExercitiu(genuflexiuni);
        ch2.executaChallange();
    }
}
