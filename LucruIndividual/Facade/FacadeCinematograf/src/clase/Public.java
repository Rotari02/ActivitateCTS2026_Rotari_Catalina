package clase;

import java.util.ArrayList;

public class Public {
    private int nrPersoane;
    private ArrayList<Persoana> listaPersoane;

    public Public(int _nrPersoane) {
        nrPersoane = _nrPersoane;
        listaPersoane=new ArrayList<Persoana>();
        for(int i=0;i<nrPersoane;i++){
            listaPersoane.add(new Persoana("P"+(i+1)));
        }
    }

    public  void publicIntraInSala(){
        System.out.println("Publicul intra in sala");
        for(int i=0;i<nrPersoane;i++){
            listaPersoane.get(i).merge();
        }
    }

    public void publicIeseDinSala(){
        System.out.println("Publicul iese din sala");
        for(int i=0;i<nrPersoane;i++){
            listaPersoane.get(i).merge();
        }
    }
}
