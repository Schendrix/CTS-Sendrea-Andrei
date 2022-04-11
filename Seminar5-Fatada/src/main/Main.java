package main;

import autobuz.Autobuz;
import autobuz.Fatada;

public class Main {


    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();

        Fatada.inchideUsi(autobuz);
        Fatada.deschideUsi(autobuz);
    }
}
