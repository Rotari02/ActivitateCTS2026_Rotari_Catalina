package clase;

public class GestiuneStocuriMedicamente {
    private Farmacie farmacie;

    public GestiuneStocuriMedicamente(Farmacie farmacie) {
        this.farmacie = farmacie;
    }

    public boolean verificaStocPentruMedicament(int id, int cantitate){
        return this.farmacie.verificaStoc(id,cantitate);
    }

    public Farmacie getFarmacie() {
        return farmacie;
    }
}
