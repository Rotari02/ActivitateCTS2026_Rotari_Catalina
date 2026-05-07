package clase;

import inchiriereMasini.Masina;
import inchiriereMasini.MasinaInchiriata;

public class PachetMasinaInchiriata extends MasinaInchiriata implements PachetTuristic {

   /*  Adapter de clase:
             Clasa Adapter moștenește clasa existente și implementează interfața la care
    trebuie să facă adaptarea.
             Prin implementarea interfeței se asigură implementarea unui set de metode.
    Aceste metode vor face apeluri/call-uri ale metodelor specifice clasei existente
    prin intermediul părintelui (super).*/

    public PachetMasinaInchiriata(Masina masina) {
        super(masina);
    }

    @Override
    public void descriere() {
        System.out.println(super.toString());
    }

    @Override
    public void rezervaPachet() {
        super.inchiriazaMasina();
    }
}
