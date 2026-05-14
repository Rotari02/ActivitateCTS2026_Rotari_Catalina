package proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyAntivirus implements IHttpCall{
   private  IHttpCall httpCall;
   private List<String> siteuriMalitioase;

    public ProxyAntivirus(IHttpCall httpCall) {
        this.httpCall = httpCall;
        this.siteuriMalitioase=new ArrayList<>();
        this.siteuriMalitioase.add("virus.com");
        this.siteuriMalitioase.add("malitios.com");
        this.siteuriMalitioase.add("hacker.com");
    }

    @Override
    public String get(String url) {
        if (siteuriMalitioase.contains(url)) {
            return "Acces blocat catre site-ul malițios: " + url;
        }

        return httpCall.get(url);
    }

    @Override
    public boolean ping(String url) {
        if(siteuriMalitioase.contains(url)){
            System.out.println("Ping blocat pt siteul "+url);
            return false;
        }
        return httpCall.ping(url);
    }
}
