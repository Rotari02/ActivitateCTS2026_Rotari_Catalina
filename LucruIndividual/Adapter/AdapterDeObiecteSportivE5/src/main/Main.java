package main;

import clase.AdapterBilet;
import clase.EBiletRo;
import clase.IBilet;

public class Main {
    public static void main(String[] args) {
        EBiletRo bilet = new EBiletRo();
        IBilet adapter = new AdapterBilet(bilet);
        adapter.vindeBilet("Romania-Grecia", "20.02.2026");
        adapter.rezervaBilet("Romania-Spania", "24.05.2026");
    }
}

