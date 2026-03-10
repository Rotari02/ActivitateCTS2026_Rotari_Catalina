package ro.ase.cts.cinematografLazyInitialization;

public class Cinematograf {
    private String nume;
    private String adresa;
    private int nrSali;
    private  static Cinematograf instanta =null; //lazy Initialization Singelton
    //Constructorul clasei  este private,
    // astfel incat, sa poata fi apelat doar din interiorul clasei


    private Cinematograf(int nrSali) {
        nume ="Cinematograf Tandarica";
        adresa="Romania";
        this.nrSali = nrSali;
    }

    public static Cinematograf getInstanta(int nrSali) {  //se creeaza obiectul daca instanta este null,
        // daca nu se returneza obiectul deja existent
        if(instanta ==null)
            instanta= new Cinematograf(nrSali);
        return instanta;
    }

    @Override
    public String toString() {
       return "Cinematograf [nume= "+nume+", adresa= "+adresa+", nr_sali= "+nrSali+"]";
    }
}
