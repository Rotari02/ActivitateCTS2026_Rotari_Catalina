package ro.ase.cts.clase;

import java.sql.SQLOutput;

public class TransportAutobuz implements IPachetTuristic{
    @Override
    public void afisareDescriere() {
        System.out.println("Acesta este un pachet de tip TRANSPORT AUTOBUZ");
    }
}
