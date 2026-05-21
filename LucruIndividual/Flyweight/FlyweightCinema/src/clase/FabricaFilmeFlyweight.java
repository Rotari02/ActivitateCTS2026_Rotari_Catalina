package clase;

import java.util.HashMap;

public class FabricaFilmeFlyweight {
//    private HashMap<String,Ifilm> filme =new HashMap<String,Ifilm>();
    private HashMap<String,Ifilm> filme=new HashMap<String,Ifilm>();


//    public Ifilm getFilm(String denumire) {
//       Ifilm film=filme.get(denumire);
//       if(film==null){
//           film=new Film(denumire);
//           filme.put(denumire,film);
//       }
//       return film;
//    }


   public Ifilm getFilm(String denumire){
       Ifilm film=filme.get(denumire);
       if(film==null){
           film=new Film(denumire);
           filme.put(denumire,film);
       }
       return film;
   }

    public int dimensiuneListaFilme(){
        return this.filme.size();
    }
}
