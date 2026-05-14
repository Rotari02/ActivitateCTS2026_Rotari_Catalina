package chain;

public class MainChain {
    public static void main(String[] args) {
        AntivirusHandler handlerMin= new VirusMic();
        AntivirusHandler handlerMediu=new VirusMediu();
        AntivirusHandler handlerMaxim=new HandleMaxim();

        handlerMin.setSuccesor(handlerMediu);
        handlerMediu.setSuccesor(handlerMaxim);

        System.out.println("Scenariu Virus mic");
        handlerMin.handleVirus(1);

        System.out.println("Scenariu Virus mediu");
        handlerMin.handleVirus(4);

        System.out.println("Scenariu Virus maxim");
        handlerMin.handleVirus(10);



    }
}
