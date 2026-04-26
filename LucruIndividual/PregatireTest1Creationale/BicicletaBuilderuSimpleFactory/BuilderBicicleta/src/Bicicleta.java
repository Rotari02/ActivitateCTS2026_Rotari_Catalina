public class Bicicleta implements IBicileta{
   private final float diametruRoti;
   private final float pret;
   private final TipFrana tipFrana;
   private final boolean areCascaDeProtectie;
   private final boolean areOchelari;
   private final boolean areCotiere;
   private final boolean areGenunchiere;


    public Bicicleta(float diametruRoti, float pret, TipFrana tipFrana, boolean areCascaDeProtectie, boolean areOchelari, boolean areCotiere, boolean areGenunchiere) {
        this.diametruRoti = diametruRoti;
        this.pret = pret;
        this.tipFrana = tipFrana;
        this.areCascaDeProtectie = areCascaDeProtectie;
        this.areOchelari = areOchelari;
        this.areCotiere = areCotiere;
        this.areGenunchiere = areGenunchiere;
    }

   private String decizieExtraOptiune(boolean optiune){
        return  optiune?"da":"nu";
   }


    @Override
    public void descriere() {
        StringBuilder sb =new StringBuilder("\nDiametru roti: ");
        sb.append(this.diametruRoti).append(" cm.")
                .append("\n\tPret: ").append(this.pret).append(" RON")
                .append("\n\t Tip frana: ").append(this.tipFrana)
                .append("\n\tCasca de protectie inclusa").append(decizieExtraOptiune(this.areCascaDeProtectie))
                .append("\n\tOchelari: ").append(decizieExtraOptiune(this.areOchelari))
                .append("\n\tCotiere: ").append(decizieExtraOptiune(this.areCotiere))
                .append("\n\tGenunchiere: ").append(decizieExtraOptiune(this.areGenunchiere)).append("\n");
        System.out.println(sb.toString());

    }
}
