package ro.ase.cts.AutoritatePescuitSingletonEagerAndLazy;

public class AutoritatePescuitSingletonLazyI {
    private String denumire;
    private String website;
    private int nrAngajati;
    private int nrAutorizatiiEmise;

    private static AutoritatePescuitSingletonLazyI instanta= null;

    private AutoritatePescuitSingletonLazyI(String denumire, String website, int nrAngajati, int nrAutorizatiiEmise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiiEmise = nrAutorizatiiEmise;
    }

    //thread safe
    public static synchronized  AutoritatePescuitSingletonLazyI getInstanta(String denumire,String website,int nrAngajati, int nrAutorizatiiEmise) {
        if(instanta == null){
            instanta=new AutoritatePescuitSingletonLazyI(denumire,website,nrAngajati,nrAutorizatiiEmise);
        }
        return  instanta;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void angajeaza(int nrAngajati) {
        this.nrAngajati+=nrAngajati;
    }

    public void concediaza(int nrAngajati) {
        this.nrAngajati-=nrAngajati;
    }

    public void emiteAutorizatie (String numePersoana) {
        System.out.println(new StringBuilder("A fost emisa autorizatia pentru ").append(numePersoana));
        nrAutorizatiiEmise++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritatePescuitSingletonLazyI{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrAutorizatiiEmise=").append(nrAutorizatiiEmise);
        sb.append('}');
        return sb.toString();
    }
}
