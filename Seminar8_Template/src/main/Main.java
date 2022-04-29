package main;

import template.Tramvai;

public class Main {
    public static void main(String[] args) {
        Tramvai tramvai=new Tramvai();
        tramvai.parcurgeSensNormal();
        System.out.println();
        tramvai.parcurgereSensInvers();
    }
}
