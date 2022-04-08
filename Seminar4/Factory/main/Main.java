package problemaTransport.main;

import problemaTransport.factory.SimpleFactory;
import problemaTransport.family.MijlocTransport;
import problemaTransport.family.TipTransport;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        MijlocTransport tramvai=factory.returneazaMijloc(TipTransport.TRAMVAI,"B 94 AFC");
        MijlocTransport autobuz=factory.returneazaMijloc(TipTransport.AUTOBUZ,"B 23 LJY");
        MijlocTransport troleibuz=factory.returneazaMijloc(TipTransport.TROILEIBUZ,"B 35 ALK");

        List<MijlocTransport> mijloace=new ArrayList<>();
        mijloace.add(tramvai);
        mijloace.add(autobuz);
        mijloace.add(troleibuz);

        mijloace.forEach(mijloc->mijloc.printNrInmatriculare());
    }
}
