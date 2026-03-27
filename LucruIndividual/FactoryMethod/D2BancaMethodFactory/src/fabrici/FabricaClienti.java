package fabrici;

import clase.AClient;

public interface FabricaClienti {
    AClient creeazaClient(String nume, String adresa, String extra);
}
