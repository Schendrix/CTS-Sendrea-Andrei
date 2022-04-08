package main;

import prototype.Autobuz;
import prototype.MijlocTransport;

public class Main {
    public static void main(String[] args)  {
        Autobuz autobuz=new Autobuz("Andrei");

        try {
            Autobuz autobuz2= (Autobuz) autobuz.copiaza();
            autobuz2.setSoferAutobuz("Mihai");
            System.out.println(autobuz2.getSoferAutobuz());
            System.out.println(autobuz.getSoferAutobuz());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
