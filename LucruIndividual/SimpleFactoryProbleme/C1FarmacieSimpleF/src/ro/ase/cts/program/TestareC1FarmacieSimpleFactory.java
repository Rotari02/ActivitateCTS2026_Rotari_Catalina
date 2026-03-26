package ro.ase.cts.program;

import ro.ase.cts.clase.Medicament;
import ro.ase.cts.fabrica.FabricaMedicamente;
import ro.ase.cts.fabrica.TipMedicament;

import java.util.ArrayList;
import java.util.List;

public class TestareC1FarmacieSimpleFactory {
    public static void main(String[] args) {
        FabricaMedicamente fabrica = new FabricaMedicamente("Catena");
        Medicament m1= fabrica.creazaMedicament(TipMedicament.BODY,15.00f,"BodySave");
        Medicament m2= fabrica.creazaMedicament(TipMedicament.BODY,19.00f,"FlyBod");
        Medicament m3= fabrica.creazaMedicament(TipMedicament.DURERE,20,"Advil");
        Medicament m4= fabrica.creazaMedicament(TipMedicament.DURERE,21.00f,"StopDur");
        Medicament m5=fabrica.creazaMedicament(TipMedicament.RACEALA,20.00f,"Parasinus");
        Medicament m6=fabrica.creazaMedicament(TipMedicament.RACEALA,25.00f, "Nurofen");

        List<Medicament> listaMedicamente = new ArrayList<>();
        listaMedicamente.add(m1);
        listaMedicamente.add(m2);
        listaMedicamente.add(m3);
        listaMedicamente.add(m4);
        listaMedicamente.add(m5);
        listaMedicamente.add(m6);

        System.out.println("Fabrica "+fabrica.getDenumireFabrica() +" produce urmatoarele medicamente;\n");
                listaMedicamente.forEach(medicament -> System.out.println(medicament.toString()));
    }


}
