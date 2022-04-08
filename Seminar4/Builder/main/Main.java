package main;

import builder.Autobuz;
import builder.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new AutobuzBuilder().setModel("Ford").setSofer("Vasile").build();
        Autobuz autobuz2=new AutobuzBuilder().setNrInmatriculare("B123456").build();
        System.out.println(autobuz.toString());
        System.out.println(autobuz2.toString());

    }
}
