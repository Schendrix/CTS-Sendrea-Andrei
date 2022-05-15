package main;

import memento.Autobuz;
import memento.ManagerAutobuze;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Andrei",3,"Honda",4);
        ManagerAutobuze managerAutobuze= new ManagerAutobuze();


        managerAutobuze.adaugaMemento(autobuz.save());
        System.out.println(autobuz.toString());

        autobuz.setDenumire("Alex");
        autobuz.setConsum(5);
        managerAutobuze.adaugaMemento(autobuz.save());
        System.out.println(autobuz.toString());

        autobuz.undo(managerAutobuze.getMemento(0));
        System.out.println(autobuz.toString());

    }


}
