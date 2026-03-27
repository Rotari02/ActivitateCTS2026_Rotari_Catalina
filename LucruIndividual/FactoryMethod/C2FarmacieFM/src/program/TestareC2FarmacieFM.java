package program;

import clase.Medicament;
import farmacii.FabricaMedicamentBody;
import farmacii.FabricaMedicamentDurere;
import farmacii.FabricaMedicamentRaceala;
import farmacii.FabricaMedicamente;

import java.util.ArrayList;
import java.util.List;

public class TestareC2FarmacieFM {
    public static void main(String[] args) {
        FabricaMedicamente fabricaMedicamenteRaceala = new FabricaMedicamentRaceala();
        FabricaMedicamente fabricaMedicamenteDurere =new FabricaMedicamentDurere();
        FabricaMedicamente fabricaMedicamenteBody =new FabricaMedicamentBody();

        List<Medicament> medicamente =new ArrayList<>();

        medicamente.add(fabricaMedicamenteRaceala.creazaMedicament(20, "Nurofen"));
        medicamente.add(fabricaMedicamenteBody.creazaMedicament(24,"BodDur"));
        medicamente.add(fabricaMedicamenteDurere.creazaMedicament(18,"Advil"));

        System.out.println("Sunt disponibile urmatoarele medicamente: ");
        medicamente.forEach(medicament-> System.out.println(medicament.toString()));
    }
}
