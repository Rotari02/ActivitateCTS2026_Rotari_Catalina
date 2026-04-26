package Fabrici;

import clase.Bicicleta;
import clase.BicicletaElectrica;
import clase.BicicletaMTB;
import clase.TipFrana;

public class FabricaBiciclete {
    public Bicicleta creeazaBicicleta(TipBicicleta tipBicicleta, float diametruRoti, float pret, TipFrana tipFrana,
                                      boolean areCascaProtectie, boolean areOchelari, boolean areCotiere,
                                      boolean areGenunchiere) throws Exception {
        Bicicleta bicicleta=null;
        try {
            switch (tipBicicleta) {
                case MTB:
                    return new BicicletaMTB(diametruRoti, pret, tipFrana, areCascaProtectie, areOchelari, areCotiere, areGenunchiere);
                case ELECTRICA:
                    return new BicicletaElectrica(diametruRoti, pret, tipFrana, areCascaProtectie, areOchelari, areCotiere, areGenunchiere);
                default:
                    return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bicicleta;
    }
}
