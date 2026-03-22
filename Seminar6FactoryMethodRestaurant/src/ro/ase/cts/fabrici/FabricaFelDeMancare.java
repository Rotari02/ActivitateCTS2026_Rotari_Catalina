package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.enumuri.TipFelDeMancare;

public interface FabricaFelDeMancare {
    FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret);
    FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int calorii, int gramaj, double pret);
}