package chain;

public class HandleMaxim extends AntivirusHandler {
    @Override
    public void handleVirus(int severity) {
        if (severity > 7) {
            System.out.println("A fost detectat un virus Maxim " + "\"Antivirusul izoleaza complet procesul infectat.");
        }
    }
}
