package clase;
public class
Film implements Ifilm{
    private String denumire;

    public Film(String denumire) {
        this.denumire = denumire;
    }


    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void play(Sala sala) {
        System.out.println(denumire+" a inceput in sala "+sala.getNrSala());

    }
}
