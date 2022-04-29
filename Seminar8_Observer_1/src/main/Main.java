package main;

import observer.Autobuz;
import observer.Calator;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("A plecat");

        Calator calator= new Calator("Boss");
        Calator calator1= new Calator("Boss1");
        Calator calator2= new Calator("Boss2");
        Calator calator3= new Calator("Boss3");

        autobuz.adaugaObsever(calator);
        autobuz.adaugaObsever(calator1);
        autobuz.adaugaObsever(calator2);

        autobuz.anuntaCalator();
        System.out.println();

        autobuz.adaugaObsever(calator3);
        autobuz.stergeObserver(calator);
        autobuz.stergeObserver(calator1);

        autobuz.anuntaCalator();

    }
}
