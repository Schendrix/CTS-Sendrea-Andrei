package main;

import command.Autobuz;
import command.ComandaPleacaInCursa;
import command.ICommanda;
import command.Operator;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz(106,2);
        Operator operator = new Operator();
        ICommanda commanda1 = new ComandaPleacaInCursa(2,autobuz);
        ICommanda commanda2 = new ComandaPleacaInCursa(4,autobuz);
        ICommanda commanda3 = new ComandaPleacaInCursa(6,autobuz);
        operator.adaugaCommand(commanda1);
        operator.invocaComanda();
        operator.adaugaCommand(commanda2);
        operator.adaugaCommand(commanda3);
        operator.invocaComanda();
    }
}
