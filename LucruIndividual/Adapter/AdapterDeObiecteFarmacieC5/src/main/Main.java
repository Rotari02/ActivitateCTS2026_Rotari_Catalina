package main;

import clase.*;

public class Main {
    public  static  void afisareDisponibilitate(IVazare soft,int idMedicament, int canttitate){
        soft.setareMedicament(idMedicament);
        boolean estePeStoc= soft.verificareDisponibilitate(canttitate);
        if(estePeStoc){
            System.out.println("Medicament cu id-ul:"+idMedicament+" este pe stoc");
        }else{
            System.out.println("Medicaemntul cu id-ul "+idMedicament+" Nu este pe stoc");
        }
    }

    public static void main(String[] args) {
        Medicament m1=new Medicament(1,"Paracetamol");
        Medicament m2= new Medicament(2,"Ebuprofen");

        Farmacie farmacie=new Farmacie();
        farmacie.adaugaStoc(m1,2);
        farmacie.adaugaStoc(m2,0);

        GestiuneStocuriMedicamente gestiune =new GestiuneStocuriMedicamente(farmacie);
        IVazare adapterFarmacie =new AdapterGestiuneFarmacie(gestiune);

        afisareDisponibilitate(adapterFarmacie,m1.getId(),1);
        afisareDisponibilitate(adapterFarmacie,m2.getId(),2);
        afisareDisponibilitate(adapterFarmacie,3,2);

    }
}
