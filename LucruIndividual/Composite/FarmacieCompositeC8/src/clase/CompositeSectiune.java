package clase;

import java.util.ArrayList;
import java.util.List;

public class CompositeSectiune implements IComponentaGrupare{
    private String denumire;
    private List<IComponentaGrupare> componente;

    public CompositeSectiune(String denumire) {
        this.denumire = denumire;
        this.componente =new ArrayList<IComponentaGrupare>();
    }


    @Override
    public void descriereComponenta(String aliniat) {
        System.out.println(aliniat +"Medicamente "+this.denumire+":");
        for(IComponentaGrupare componenta: componente){
            componenta.descriereComponenta(aliniat+aliniat);
        }
    }

    @Override
    public void adaugaComponenta(IComponentaGrupare coponenta) {
        this.componente.add(coponenta);
    }

    @Override
    public void stergeComponenta(IComponentaGrupare coponenta) {
        this.componente.remove(coponenta);
    }
}
