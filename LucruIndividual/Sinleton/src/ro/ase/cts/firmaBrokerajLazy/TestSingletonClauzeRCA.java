package ro.ase.cts.firmaBrokerajLazy;

public class TestSingletonClauzeRCA {
    public static void main(String[] args)throws Exception {
        SinletonClauzeRCA clauzeRCA1= SinletonClauzeRCA.getInstance();
        SinletonClauzeRCA clauzeRCA2 =SinletonClauzeRCA.getInstance();

        if(clauzeRCA1 ==clauzeRCA2)
            System.out.println("Referinte identice");
        else
            System.out.println("Referintele nu sunt identice");
        clauzeRCA1.setLimitaMaximaAsigurareAutoturisme(5000);
        System.out.println(clauzeRCA1.getLimitaMaximaAsigurareAutoturisme());
        System.out.println(clauzeRCA2.getLimitaMaximaAsigurareAutoturisme());


    }
}
