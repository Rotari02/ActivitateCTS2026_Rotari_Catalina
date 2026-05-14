package proxy;

public class Main {
    public static void main(String[] args) {

        IHttpCall request1 = new ProxyAntivirus(new AntivirusHttpCall());
        IHttpCall r2=new ProxyAntivirus(new AntivirusHttpCall());
        IHttpCall r3=new ProxyAntivirus(new AntivirusHttpCall());

        System.out.println(request1.get("virus.com"));
        System.out.println();

        System.out.println(r2.get("google.com"));
        System.out.println();

        System.out.println(r3.get("Booking.com"));
        System.out.println();


        System.out.println(request1.ping("virus.com"));
        System.out.println();

        System.out.println(r2.ping("google.com"));
        System.out.println();


    }
}
