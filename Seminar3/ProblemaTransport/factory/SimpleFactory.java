package problemaTransport.factory;

import problemaTransport.family.*;

public class SimpleFactory {
    public MijlocTransport returneazaMijloc(TipTransport tip, String nrInmatriculare){
        switch(tip){
            case TRAMVAI:
                return new Tramvai(nrInmatriculare);
            case AUTOBUZ:
                return new Autobuz(nrInmatriculare);
            case TROILEIBUZ:
                return new Troleibuz(nrInmatriculare);
            default:
                return null;
        }
    }
}
