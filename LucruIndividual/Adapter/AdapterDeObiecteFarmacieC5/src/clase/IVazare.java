package clase;

public interface IVazare {
    void setareMedicament(int id);
    boolean verificareDisponibilitate(int cantitateDorita);

    /* De
exemplu aplicația de vânzare conține metoda setareMedicament(), care primește id-ul
medicamentului și apoi verificareDisponibilitate() care primește numărul de medicamente dorite
pentru medicamentul setat anterior și returnează true sau false.*/
}
