package main;

import clase.CompositeSectiune;
import clase.IComponentaGrupare;
import clase.Medicament;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IComponentaGrupare sectiuneRaceala = new CompositeSectiune("Raceala");
        IComponentaGrupare sectiuneDurere = new CompositeSectiune("Durere");
        IComponentaGrupare sectiuneAntibiotice = new CompositeSectiune("Antibiotice");

        IComponentaGrupare copii = new CompositeSectiune("Copii");
        IComponentaGrupare adulti = new CompositeSectiune("Adulti");

        IComponentaGrupare medicament1 = new Medicament("Paduden", 15.5f);
        IComponentaGrupare medicament2 = new Medicament("Sindolor", 35.75f);
        IComponentaGrupare medicament3 = new Medicament("Dolorgit", 40f);
        IComponentaGrupare medicament4 = new Medicament("Panadol adulti", 30f);

        IComponentaGrupare medicament5 = new Medicament("Panadol Baby", 35.5f);
        IComponentaGrupare medicament6 = new Medicament("Calgel", 26f);

        IComponentaGrupare medicament7 = new Medicament("TheraFlu", 49.5f);
        IComponentaGrupare medicament8 = new Medicament("Coldrex", 27f);
        IComponentaGrupare medicament9 = new Medicament("Strepsils", 30f);

        IComponentaGrupare medicament10 = new Medicament("Ospen", 45.5f);
        IComponentaGrupare medicament11 = new Medicament("Amoxicilina", 36f);


        sectiuneRaceala.adaugaComponenta(medicament7);
        sectiuneRaceala.adaugaComponenta(medicament8);
        sectiuneRaceala.adaugaComponenta(medicament9);

        adulti.adaugaComponenta(medicament1);
        adulti.adaugaComponenta(medicament2);
        adulti.adaugaComponenta(medicament3);
        adulti.adaugaComponenta(medicament4);

        copii.adaugaComponenta(medicament5);
        copii.adaugaComponenta(medicament6);

        sectiuneDurere.adaugaComponenta(adulti);
        sectiuneDurere.adaugaComponenta(copii);


        sectiuneAntibiotice.adaugaComponenta(medicament10);
        sectiuneAntibiotice.adaugaComponenta(medicament11);

//        IComponentaGrupare farmacie = new CompositeSectiune("Farmacie Tei");
//        farmacie.adaugaComponenta(sectiuneDurere);
//        farmacie.adaugaComponenta(sectiuneRaceala);
//        farmacie.adaugaComponenta(sectiuneAntibiotice);
//        farmacie.descriereComponenta(" ");

        List<IComponentaGrupare> arbore =new ArrayList<>(Arrays.asList(sectiuneDurere,sectiuneRaceala,sectiuneAntibiotice));
        for(IComponentaGrupare coponenta: arbore){
            coponenta.descriereComponenta("\t");
        }


    }
}
