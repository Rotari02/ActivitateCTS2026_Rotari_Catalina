package clase;

public class StareEfectuata implements Stare {

    @Override
    public void faActiunea(Rezervare rezervare) {
        System.out.println("Rezervarea ce are id-ul:"+rezervare.getId()+" este plasata in starea de EFECTUATA");
        rezervare.setStare(this);
    }
}
