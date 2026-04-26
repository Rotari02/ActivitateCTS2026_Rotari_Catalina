public  class BicicleteBuilder implements ABuilder{
    private  float diametruRoti;
    private float pret;
    private  TipFrana tipFrana;
    private boolean areCascaDeProtectie;
    private  boolean areOchelari;
    private  boolean areCotiere;
    private  boolean areGenunchiere;

    public BicicleteBuilder() {
        this.diametruRoti = 10;
        this.pret = 0;
        this.tipFrana = TipFrana.NICIUNA;
        this.areCascaDeProtectie = false;
        this.areOchelari = false;
        this.areCotiere = false;
        this.areGenunchiere = false;
    }

    public BicicleteBuilder setDiametruRoti(float diametruRoti) {
        this.diametruRoti = diametruRoti;
        return this;
    }

    public BicicleteBuilder setPret(float pret) {
        this.pret = pret;
        return this;
    }

    public BicicleteBuilder setTipFrana(TipFrana tipFrana) {
        this.tipFrana = tipFrana;
        return this;
    }

    public BicicleteBuilder setAreCascaDeProtectie(boolean areCascaDeProtectie) {
        this.areCascaDeProtectie = areCascaDeProtectie;
        return this;
    }

    public BicicleteBuilder setAreOchelari(boolean areOchelari) {
        this.areOchelari = areOchelari;
        return this;
    }

    public BicicleteBuilder setAreCotiere(boolean areCotiere) {
        this.areCotiere = areCotiere;
        return this;
    }

    public BicicleteBuilder setAreGenunchiere(boolean areGenunchiere) {
        this.areGenunchiere = areGenunchiere;
        return this;
    }

    @Override
    public Bicicleta buildBicicleta() {
        return new Bicicleta(this.diametruRoti,this.pret,this.tipFrana,this.areCascaDeProtectie,this.areOchelari,this.areCotiere,this.areGenunchiere);
    }
}
