package clase;

public class Facadecinema {
    private Sala sala;
    private Film film;
    private Public publicul;

    public Facadecinema() {
    }

    public void difuzeazaFilmSala(String numeSala, String numeFilm) {
        sala = new Sala(numeSala);
        publicul = new Public(3);
        film = new Film(numeFilm);
        sala.deschideUsa();
        sala.aprindeLumina();
        publicul.publicIntraInSala();
        sala.inchideUsa();
        sala.stingeLumina();
        film.play();
    }
}

