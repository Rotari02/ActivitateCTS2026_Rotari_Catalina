package clase;

public class ProxyReteta implements IAchizitie {
    private IAchizitie achizitie;

    public ProxyReteta(IAchizitie achizitie) {
        this.achizitie = achizitie;
    }


    @Override
    public void achizitioneazaMedicament(String denumireMedicament, Client client) {
        if(client.areReteta){
            this.achizitie.achizitioneazaMedicament(denumireMedicament, client);
        } else{
            System.out.println("Clientul "+client.nume+" NU poate achizitiona medicamentul "+denumireMedicament+"deoarece NU ARE RETETA");
        }
    }
}
