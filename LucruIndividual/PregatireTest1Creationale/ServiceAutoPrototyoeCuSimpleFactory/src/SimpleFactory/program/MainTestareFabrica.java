package SimpleFactory.program;

import SimpleFactory.clase.IComponenta;
import SimpleFactory.fabrica.FabricaComponente;
import SimpleFactory.fabrica.TipComponenta;

import java.util.ArrayList;
import java.util.List;

public class MainTestareFabrica {
    public static void main(String[] args) {
        System.out.println("====FABRICA COMPONENTE====");
        FabricaComponente fabrica=new FabricaComponente();
        List<IComponenta> listaComponente =new ArrayList<>();

        //creem 4 componente
        IComponenta usa1= fabrica.creazaComponenta(TipComponenta.USA);
        IComponenta usa2= fabrica.creazaComponenta(TipComponenta.USA);
        IComponenta capota1= fabrica.creazaComponenta(TipComponenta.CAPOTA);
        IComponenta capota2= fabrica.creazaComponenta(TipComponenta.CAPOTA);

        listaComponente.add(usa1);
        listaComponente.add(usa2);
        listaComponente.add(capota1);
        listaComponente.add(capota2);

        for (IComponenta componenta:listaComponente){
            componenta.componentaDetalii();
        }

    }
}
