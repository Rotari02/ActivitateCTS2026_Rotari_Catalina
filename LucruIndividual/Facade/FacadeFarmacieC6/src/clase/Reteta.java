package clase;

import java.util.List;

public class Reteta {
    protected List<Medicament> listaMedicamente;

    public Reteta(List<Medicament> listaMedicamente) {
        this.listaMedicamente = listaMedicamente;
    }

    public void verificaReteta(){
        System.out.println("\nVerificare Reteta");
        int count=1;
        for(Medicament medicament:listaMedicamente){
            System.out.println(count+" ) "+medicament.nume+" - "+medicament.pret+" RON");
            count++;
        }
        System.out.println();
    }
}

