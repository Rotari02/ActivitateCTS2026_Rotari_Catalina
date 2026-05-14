package chain;

public class VirusMic extends  AntivirusHandler{
    @Override
    public void handleVirus(int severity) {
        if(severity<=3){
            System.out.println("Virus cu severitate MICA detectat "+"Procesul infectat s-a oprit automat");
        }else{
            super.getSuccesor().handleVirus(severity);
        }
    }
}
