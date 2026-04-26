package Singleton;

public class Main {
    public static void main(String[] args) {
        IService service =Service.getInstanta("Aparatorii Patriei SA","Aparatorii Patriei Nr:4, Bucuresti");

        try{
            AMasina masina1=new Masina("B123BDF","Volvo",20000.00);
            AMasina masina2=new Masina("B456ADF","Audi",798638.00);

            service.adaugaMasinaInService(masina1);
            service.afiseazaDetaliiService();

            service.adaugaMasinaInService(masina2);
            System.out.println("================adugare alta masina , verificare Singleton=============");
            service.afiseazaDetaliiService();


            System.out.println("=====SCOATERE MASINA DIN SERVICE=======");
            service.scoateMasinaDinService();
            System.out.println("====Verificare singleton cu noua masina ===");
            service.adaugaMasinaInService(masina2);

            service.afiseazaDetaliiService();
            Masina masina3 =new Masina("B125ABD","Dacia",678967.00);




        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
