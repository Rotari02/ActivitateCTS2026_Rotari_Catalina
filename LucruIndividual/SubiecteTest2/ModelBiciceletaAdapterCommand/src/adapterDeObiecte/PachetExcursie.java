package adapterDeObiecte;

public class PachetExcursie implements IPachetTuristic{
    private String destinatie;

    public PachetExcursie(String destinatie) {
        this.destinatie = destinatie;
    }

    @Override
    public void descrierePachet() {
        System.out.println("Pachet excursie pentru destinatia "+destinatie);
    }

    @Override
    public void rezervaPachet() {
        System.out.println("Excursia pentru " + destinatie + " a fost rezervata.");
    }

    @Override
    public void vindePachet() {
        System.out.println("Excursia pentru " + destinatie + " a fost vanduta.");
    }
}
