package clase;

public class Sala {
    private int nrSala;

    public Sala() {
        this.nrSala = 8;
    }

    public Sala(int numarSala) {
        this.nrSala = numarSala;
    }

    public int getNrSala() {
        return nrSala;
    }

    public void setNrSala(int nrSala) {
        this.nrSala = nrSala;
    }

    @Override
    public String toString() {
      return  "Sala[nrSala="+nrSala+"]";
    }
}
