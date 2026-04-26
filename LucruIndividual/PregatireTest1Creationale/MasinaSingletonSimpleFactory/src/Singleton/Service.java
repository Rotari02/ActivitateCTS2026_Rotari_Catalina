package Singleton;
//Singleton
public class Service implements IService{
   private String numeService;
   private  String adresa;
   private AMasina masinaInService;

   private static Service instanta=null;

    private Service(String numeService, String adresa) {
        this.numeService = numeService;
        this.adresa = adresa;
        this.masinaInService=null;
    }

    public static synchronized Service getInstanta(String numeService, String adresa) {
        if(instanta==null) {
            instanta=new Service(numeService,adresa);
        }
        return instanta;
    }


    @Override
    public void adaugaMasinaInService(AMasina masina) {
        if(masinaInService==null) {
            this.masinaInService = masina;
        } else {
            System.out.println("Momentan se afla deja o masina in service");
        }
    }

    @Override
    public void scoateMasinaDinService() {
        if(masinaInService!=null) {
            this.masinaInService = null;
            System.out.println("Service-ul este gol/ disponibil");
        }
    }

    @Override
    public void afiseazaDetaliiService() {
        StringBuilder sb =new StringBuilder("\nService: ");
        sb.append("\nNume service: ").append(this.numeService);
        sb.append("\nAdresa: ").append(this.adresa.toUpperCase());
        sb.append("\nDisponibilitate: ").append(this.masinaInService==null?"Da":"NU");
        System.out.println(sb.toString());
        if(this.masinaInService!=null) {
            this.masinaInService.detaliiMasina();
        }
    }
}
