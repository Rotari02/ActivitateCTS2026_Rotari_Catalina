package clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Optiune {
    List<Optiune> listaOptiuni;
    String nume;

    public Categorie(String nume) {
        listaOptiuni = new ArrayList<Optiune>();
        this.nume = nume;
    }

    @Override
    public void stergeNod(Optiune optiune) throws Exception {
        listaOptiuni.remove(optiune);
    }

    @Override
    public void adaugaNod(Optiune optiune) throws Exception {
        listaOptiuni.add(optiune);
    }

    @Override
    public Optiune getNod(int index) throws Exception {
        return listaOptiuni.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Categoria " + nume);
        for (Optiune optiune : listaOptiuni) {
            optiune.descriere();
        }
    }
}
