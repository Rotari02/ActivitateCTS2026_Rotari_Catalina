//package ro.ase.cts.ManagerAutentificareLazy;
//
//public class ManagerAutentificareLazy {
//    private String user;
//    private String token;
//    private boolean esteAutentificat;
//    //static instance
//    private static  ManagerAutentificareLazy instance;
//
//    //cpnstructor privat
//    private  ManagerAutentificareLazy() {
//        esteAutentificat=false;
//    }
//
//    //functie statica care returneaza instanta
//    public static ManagerAutentificareLazy getInstance(){
//        if(instance == null){
//            instance =new ManagerAutentificareLazy();
//        }
//        return instance;
//    }
//
//    public void autentifica(String user) {
//        this.user=user;
//        this.token ="token_"+user;
//        this.esteAutentificat =true;
//    }
//
//    public  void delogare() {
//        user=null;
//        token=null;
//        esteAutentificat=false;
//    }
//
//    public boolean esteAutentificat() {
//        return  esteAutentificat;
//    }
//
//    public String getToken() {
//      //  return  esteAutentificat ? token: "Neautentif"
//        ///de continuat si terminat programukl
//    }
//}
