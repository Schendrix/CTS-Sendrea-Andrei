package singleton;

public class Singleton {
    //Eager initialization
    //private static Singleton instanta = new Singleton();

    //Lazy initializatino
    private static Singleton instanta=null;
    synchronized public static Singleton returneazaInstanta(){
        if(instanta==null){
            instanta=new Singleton();
        }
        return instanta;
    }

    private Singleton() {
    }
}