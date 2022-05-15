package main;

import chainofresponsabilty.MetrouHandler;
import chainofresponsabilty.MijlocTransportHandler;
import chainofresponsabilty.TramvaiHandler;
import chainofresponsabilty.TroleibuzHandler;

public class Main {
    public static void main(String[] args) {
        MijlocTransportHandler handlerAutobuz= new MetrouHandler();
        MijlocTransportHandler handlerTramva= new TramvaiHandler();
        MijlocTransportHandler handlerMetrou = new TroleibuzHandler();


        handlerAutobuz.recomandaMijloc(10);
        handlerMetrou.recomandaMijloc(2);
    }
}
