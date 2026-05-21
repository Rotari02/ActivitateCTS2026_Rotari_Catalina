package test;

import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersoanaTest {

    @org.junit.Test
    public void testGetVarsta() {
        Persoana persoana = new Persoana("Andrei", "6041127030047");
        assertEquals(21, persoana.getVarsta());
    }

    @org.junit.Test
    public void testBoundaryGetVarsta() {
        Persoana persoan2 = new Persoana("Avram", "1991231898976");
        assertEquals(26, persoan2.getVarsta());
    }

    @org.junit.Test
    public void testBoundaryGetVarstaZiCurenta() {
        Persoana persoana3 = new Persoana("Marin", "5000520890989");
        assertEquals(26, persoana3.getVarsta());
    }

    @org.junit.Test
    public void testCrossCheckGetSex() {
        Persoana persoana4 = new Persoana("Marin", "5000520890989");
        String cnp1 = "5000520890989";
        assertEquals(cnp1.charAt(0) % 2 == 0 ? "F" : "M", persoana4.getSex());
    }

    @org.junit.Test(expected =IllegalArgumentException.class)
    public void testCnpInvalid(){
        Persoana persoana=new Persoana("Marin","60007120898908");
        persoana.checkCNP();
    }

    @org.junit.Test(expected =IllegalArgumentException.class)
    public void testCnpInvalid1(){
        Persoana persoana=new Persoana("Ion","600071208989b");
        persoana.checkCNP();
    }

    @Test(timeout =20)
    public void testPerformanceGetVarsta(){
        Persoana persoana=new Persoana("Marin","5000712089089");
        persoana.getVarsta();
    }

    @Test
    public void testeOrdineVarsta(){
        Persoana persoana=new Persoana("Marin","3000712089089");
        Persoana persoana2=new Persoana("Ion","5000912089089");
        assertTrue(persoana.getVarsta()>persoana2.getVarsta());
    }

//    @Test
//    public void testareDataViitor()
//        Persoana persoana=new Persoana("Marin","3000712089089");
//        Persoana persoana2=new Persoana("Ion","5000912089089");
//        assertTrue(persoana.getVarsta()>persoana2.getVarsta());
//    }




}