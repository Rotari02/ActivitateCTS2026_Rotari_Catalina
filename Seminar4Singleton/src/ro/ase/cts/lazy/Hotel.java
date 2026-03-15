package ro.ase.cts.lazy;

public class Hotel {
    private String denumireHotel;
    private int nrCamere;
    private int nrCamereInchiriate;
    private int nrAngajati;

    public void afisareInchiriereCamera() {
        if(nrCamereInchiriate ==nrCamere){
            System.out.println("Num mai sunt camere disponibile");
        }
        else {
            System.out.println("Camera a fost inchiriata");
            nrCamereInchiriate++;
        }
    }

    private Hotel(String denumireHotel, int nrCamere,  int nrAngajati) {
        this.denumireHotel = denumireHotel;
        this.nrCamere = nrCamere;
        this.nrCamereInchiriate = 0;
        this.nrAngajati = nrAngajati;
    }

    public void afiseazaDescriere()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(denumireHotel);
        sb.append(nrCamere);
        sb.append(nrCamereInchiriate);
        sb.append(nrAngajati);
        System.out.println(sb.toString());
    }

    private static Hotel  instanta = null;

    public static synchronized Hotel getInstanta( String denumireHotel, int nrCamere, int nrAngajati) {
        if(instanta ==null) {
            instanta = new Hotel(denumireHotel,nrCamere,nrAngajati);
        }
        return instanta;
    }





}
