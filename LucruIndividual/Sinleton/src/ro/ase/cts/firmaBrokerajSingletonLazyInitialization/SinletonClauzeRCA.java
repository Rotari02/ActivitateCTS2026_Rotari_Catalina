package ro.ase.cts.firmaBrokerajSingletonLazyInitialization;

public class SinletonClauzeRCA {
    //referinta la instanta unica - lazy initialization Singleton
    private static SinletonClauzeRCA instance = null;
    private int limitaMaximaAsigurareCamioane =2500;
    private int limitaMaximaAsigurareAutoturisme =2000;

    public int getLimitaMaximaAsigurareCamioane() {
        return limitaMaximaAsigurareCamioane;
    }

    public void setLimitaMaximaAsigurareCamioane(
            int limitaMaximaAsigurareCamioane) {
        this.limitaMaximaAsigurareCamioane = limitaMaximaAsigurareCamioane;
    }

    public int getLimitaMaximaAsigurareAutoturisme() {
        return limitaMaximaAsigurareAutoturisme;
    }

    public void setLimitaMaximaAsigurareAutoturisme(int limitaMaximaAsigurareAutoturisme) {
        this.limitaMaximaAsigurareAutoturisme = limitaMaximaAsigurareAutoturisme;
    }

    //constructor privat,  astfel incat, sa poata fi apelat doar din interiorul clasei

    private SinletonClauzeRCA() throws Exception{
        if(instance != null)
            throw new Exception("Obiect Singleton deja creat");
    }
    //meoda publica

    public static SinletonClauzeRCA getInstance() throws Exception{
        if(instance==null)
            instance= new SinletonClauzeRCA();
        return  instance;
    }


}
