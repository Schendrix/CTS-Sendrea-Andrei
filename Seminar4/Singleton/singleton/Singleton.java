package basicSingleton.singleton;

public class Singleton {
    private static Singleton instanta = new Singleton();
//  private static Singleton instanta=null;

    public static Singleton getInstance() {
        return instanta;
    }

//    synchronized public static Singleton getInstance(){
//        if(instanta==null){
//            instanta=new Singleton();
//        }
//        return instanta;
//    }

    private Singleton(){

    }
}
