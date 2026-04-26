import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Bicicleta> listaBiciclete =new ArrayList<Bicicleta>();

//        listaBiciclete.add(new BicicleteBuilder().buildBicicleta());
//        listaBiciclete.add(new BicicleteBuilder().setDiametruRoti(20.00f).setAreGenunchiere(true).setPret(250).buildBicicleta());
//        listaBiciclete.add(new BicicleteBuilder().setDiametruRoti(25.8f).setPret(800).setTipFrana(TipFrana.V_BRAKE).setAreCotiere(true).setAreGenunchiere(true).buildBicicleta());
//
//        int contor=1;
//        for(Bicicleta bicicleta:listaBiciclete){
//            System.out.println("Bicicleta "+contor+":");
//            bicicleta.descriere();
//            contor++;
//        }



        List<Bicicleta> listaBiciclete =new ArrayList<Bicicleta>();

        BicicleteBuilder builder =new BicicleteBuilder();
        Bicicleta bicicleta1 =builder.setAreOchelari(true).buildBicicleta();
        Bicicleta bicicleta2=builder.setDiametruRoti(20.00f).setAreGenunchiere(true).setAreOchelari(false).buildBicicleta();

        listaBiciclete.add(bicicleta1);
        listaBiciclete.add(bicicleta2);

        int contor=1;

        for(Bicicleta bicicleta:listaBiciclete){
            System.out.println("Bicicleta: "+contor+":");
            bicicleta.descriere();
            contor++;
        }





    }
}
