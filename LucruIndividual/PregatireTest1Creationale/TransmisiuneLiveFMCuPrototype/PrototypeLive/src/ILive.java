public interface ILive {
    ILive copiaza();
    void transmiteEvenimentLive();
    void adaugaComentariu(String comentariu);
    void afiseazaListaComentariilor();
    void conectareSpectator();
}
