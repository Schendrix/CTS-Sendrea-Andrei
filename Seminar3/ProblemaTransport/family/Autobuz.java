package problemaTransport.family;

public class Autobuz extends MijlocTransport{
    public Autobuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void printNrInmatriculare() {
        System.out.println("Autobuzul are numarul:"+this.getNrInmatriculare());

    }
}
