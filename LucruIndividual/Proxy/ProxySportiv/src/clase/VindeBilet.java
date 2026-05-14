package clase;

public class VindeBilet implements IVanzareBilet {

    @Override
    public void vindeBilet(Persoana persoana) {
        System.out.println("Suporterul "+persoana.nume+" in varsta de "+ persoana.varsta+" a achizitionat un bilet pentru urmatorul meci de fotbal");
    }
}
