package mainPrototype;
import prototype.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz("Andrei");
        Autobuz autobuz1;

        {
            try {
                autobuz1 = (Autobuz) autobuz.copiaza();
                System.out.println(autobuz1);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }
}
