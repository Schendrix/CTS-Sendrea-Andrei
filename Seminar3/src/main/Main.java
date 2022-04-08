package main;

import singleton.Singleton;

public class Main {
    public static void main(String args[]) {
        Singleton s1;
        s1= Singleton.returneazaInstanta();
        Singleton s2;
        s2=Singleton.returneazaInstanta();
        System.out.println(s1);
        System.out.println(s2);
    }
}
