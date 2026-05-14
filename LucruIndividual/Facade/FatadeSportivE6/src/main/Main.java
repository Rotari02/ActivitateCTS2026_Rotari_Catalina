package main;

import clase.FacadeAccesStadion;
import clase.Persoana;

public class Main {
    public static void main(String[] args) {
        Persoana persoana1=new Persoana("Vladirmirescu Stefan","AB123",true,false);
        Persoana persoana2=new Persoana("Vladirmirescu Ion","AB124",false,true);
        Persoana persoana3=new Persoana("Vladirmirescu Andrei","AB125",true,true);
        Persoana persoana4=new Persoana("Vladirmirescu Razvan","AB126",false,false);
        Persoana persoana5=new Persoana("Vladimirescu Miron","AB127",false,false);


        FacadeAccesStadion facade = new FacadeAccesStadion();
        facade.setPersoana(persoana1);
        facade.permiteAccesIntrare(persoana1.getSerieBuletin(),"Bilet1");

        facade.setPersoana(persoana2);
        facade.permiteAccesIntrare(persoana2.getSerieBuletin(),"Bilet2");

        facade.setPersoana(persoana3);
        facade.permiteAccesIntrare(persoana3.getSerieBuletin(),"Bilet3");

        facade.setPersoana(persoana4);
        facade.permiteAccesIntrare(persoana4.getSerieBuletin(),"Bilet5");

        facade.setPersoana(persoana5);
        facade.permiteAccesIntrare("Serie Necunoscuta","Bilet5");
    }

}
