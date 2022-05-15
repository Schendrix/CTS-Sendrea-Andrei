package command;

public class Autobuz {
    int nrAutobuz;
    int linie;

    public Autobuz(int nrAutobuz, int linie) {
        this.nrAutobuz = nrAutobuz;
        this.linie = linie;
    }

    public void pleacaInCursa(){
        System.out.println("A plecat in cursa!");
    }

    public void setLinie(int linie) {
        this.linie = linie;
    }
}
