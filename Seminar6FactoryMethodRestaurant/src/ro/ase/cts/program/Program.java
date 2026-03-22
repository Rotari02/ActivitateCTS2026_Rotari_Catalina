package ro.ase.cts.program;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.enumuri.TipDesert;
import ro.ase.cts.enumuri.TipSupa;
import ro.ase.cts.fabrici.FabricaDesert;
import ro.ase.cts.fabrici.FabricaFelDeMancare;
import ro.ase.cts.fabrici.FabricaSupa;

public class Program {
    public static void main(String[] args) {

        FabricaFelDeMancare fabricaFelDeMancare = new FabricaSupa();

        FelDeMancare supaDeVita = fabricaFelDeMancare.creareFelDeMancare(TipSupa.SUPADEVITA,500,15.0);
        FelDeMancare supaDeLegume =fabricaFelDeMancare.creareFelDeMancare(TipSupa.SUPADELEGUME,300,18.00);


        FabricaFelDeMancare fabricaFelDeMancare2 = new FabricaDesert();
        FelDeMancare clatite =fabricaFelDeMancare2.creareFelDeMancare(TipDesert.CLATITE,200,250,19.00);
        FelDeMancare papanasi = fabricaFelDeMancare2.creareFelDeMancare(TipDesert.PAPANASI, 230, 200,28.00);

        supaDeLegume.afiseazaDescriere();
        supaDeVita.afiseazaDescriere();
        clatite.afiseazaDescriere();
        papanasi.afiseazaDescriere();
    }
}