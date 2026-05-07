package main;

import clase.AdapterCredite;
import clase.CreditareLeasing;
import clase.CreditareStandard;
import clase.ICreditare;

public class Program {
    public static void main(String[] args) {
        CreditareLeasing creditareLeasing=new CreditareLeasing();
        ICreditare adapter=new AdapterCredite(creditareLeasing);
        adapter.acordaCredit("Oana",16000);
        adapter.acordaCredit("Vlad",13000000);
    }
}
