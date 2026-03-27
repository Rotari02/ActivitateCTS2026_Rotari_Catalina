package fabrici;

import clase.AClient;
import clase.PersoanaFizica;

public class FabricaPF implements FabricaClienti{
    @Override
    public AClient creeazaClient(String nume, String adresa, String extra) {
        return new PersoanaFizica(nume,adresa,extra);
    }
}
