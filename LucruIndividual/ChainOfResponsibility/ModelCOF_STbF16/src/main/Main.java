package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Handler troleibuz = new RecomanadaTroleibuz();
        Handler autobuz = new RecomandaAutobuz();
        Handler tramvai = new RecomandaTramvai();
        Handler metrou = new RecomandaMetrou();

        troleibuz.setSuccseor(autobuz);
        autobuz.setSuccseor(tramvai);
        tramvai.setSuccseor(metrou);

        troleibuz.recomandareMijlodDeTransport(1);
        troleibuz.recomandareMijlodDeTransport(4);
        troleibuz.recomandareMijlodDeTransport(6);
        troleibuz.recomandareMijlodDeTransport(11);



    }
}
