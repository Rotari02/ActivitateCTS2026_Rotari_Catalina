package clase;

public class Client {
    protected String nume;
    protected  boolean areCardDeSanatate;

    public Client(String nume, boolean areCardDeSanatate) {
        this.nume = nume;
        this.areCardDeSanatate = areCardDeSanatate;
    }

    public  void verificaCardSanatate(){
        System.out.println("\n Se verifica daca clientul "+this.nume+" are card de sanatate");
        if(this.areCardDeSanatate){
            System.out.println("=> DA-are card de sanatate");
        }else{
            System.out.println("=> NU- are card de sanatate");
        }
    }
}
