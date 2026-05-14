package clase;

public class ProxyVarsta implements IVanzareBilet{
    private IVanzareBilet vanzareBilet;

    public ProxyVarsta(IVanzareBilet vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    @Override
    public void vindeBilet(Persoana persoana) {
        if(persoana.varsta>=14){
            this.vanzareBilet.vindeBilet(persoana);
        } else{
            System.out.println("Suporterul "+persoana.nume+" NU are varsta minima de 14 ani pt. a achizitiona biletul la urmatorul meci");
        }
    }
}
