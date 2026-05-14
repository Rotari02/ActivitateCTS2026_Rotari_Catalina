package program;


import clase.*;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory =new FlyweightFactory();
        Detinator d1=new Detinator("Popa Ana","500002300","Str. Iuliu Maniu 4","popa.ana@gmail.com","07826485");
        Banca b1=new Banca("BCR","Unirii 1 Bucuresti",1000000000);

        IFlyweight contFlyweight =factory.getObiectFlyweight(d1,b1);
        DetaliiSpecificeCont det1=new DetaliiSpecificeCont("ROB1",100,Moneda.EUR);
        DetaliiSpecificeCont det2=new DetaliiSpecificeCont("RO123",123444,Moneda.RON);

        contFlyweight.descriereCont(det1);
        System.out.println();
        contFlyweight.descriereCont(det2);
        System.out.println();

        System.out.println("Nr total de conturi: "+factory.nrConturi());
    }

}
