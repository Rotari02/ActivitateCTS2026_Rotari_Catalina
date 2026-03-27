package fabrici;

import clase.AClient;
import clase.PersoanaJuridica;

public class FabricaPJ implements FabricaClienti{
    @Override
    public AClient creeazaClient(String nume, String adresa, String extra) {
        return new PersoanaJuridica(nume,adresa,extra);
    }
}
