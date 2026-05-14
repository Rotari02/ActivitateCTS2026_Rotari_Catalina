package chain;

public class VirusMediu extends AntivirusHandler{
    @Override
    public void handleVirus(int severity) {
        if(severity>3&& severity<=7){
            System.out.println("A fost det virus mediu , Procesul principal se executa in paralel");
        }else{
            super.getSuccesor().handleVirus(severity);
        }
    }
}
