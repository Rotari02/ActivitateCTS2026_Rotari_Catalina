package clase;

public class StareNeplatita implements Stare{
    @Override
    public void faActiunea(Rezervare rezervare) {
        System.out.println("Rezervarea ce are id-ul:"+rezervare.getId()+" este plasata in starea de NEPLATITA");
        rezervare.setStare(this);
    }
}
