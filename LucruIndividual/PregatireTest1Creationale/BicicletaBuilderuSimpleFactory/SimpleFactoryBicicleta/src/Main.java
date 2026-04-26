import Fabrici.FabricaBiciclete;
import Fabrici.TipBicicleta;
import clase.Bicicleta;
import clase.TipFrana;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FabricaBiciclete fabrica = new FabricaBiciclete();

        List<Bicicleta> bicicletaList =new ArrayList<>();
        bicicletaList.isEmpty();

        try{
            Bicicleta bicicleta1= fabrica.creeazaBicicleta(TipBicicleta.ELECTRICA,20.00f,240, TipFrana.DISC,true,true,false,false);
            Bicicleta bicicleta2 = fabrica.creeazaBicicleta(TipBicicleta.MTB, 20.07f,300,TipFrana.TAMBUR,false,false,false,true);

            bicicletaList.add(bicicleta1);
            bicicletaList.add(bicicleta2);

            bicicletaList.add(fabrica.creeazaBicicleta(TipBicicleta.ELECTRICA,30.00f,240, TipFrana.DISC,true,true,false,false));
        }
        catch (Exception e){
            e.printStackTrace();
        }

        int contor =1;

        System.out.println("====bICICLETE====");
        for(Bicicleta b: bicicletaList){
            System.out.println("Bicicleta: "+contor+":");
            b.descriere();
            contor++;
       }
    }
}