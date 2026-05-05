package clase;

public class StarePlatita implements Stare{
    @Override
    public void faActiunea(Rezervare rezervare) {
        System.out.println("Rezervarea ce are id-ul:"+rezervare.getId()+" ste plasata in starea de PLATITA");
        rezervare.setStare(this);
    }
}
