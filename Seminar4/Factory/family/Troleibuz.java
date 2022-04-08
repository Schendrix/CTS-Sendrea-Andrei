package problemaTransport.family;

public class Troleibuz extends MijlocTransport {
    public Troleibuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void printNrInmatriculare() {
        System.out.println("Troleibuzul are numarul:"+this.getNrInmatriculare());
    }
}
