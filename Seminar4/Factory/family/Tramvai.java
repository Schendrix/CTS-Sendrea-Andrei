package problemaTransport.family;

public class Tramvai extends MijlocTransport {
    public Tramvai(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void printNrInmatriculare() {
        System.out.println("Tramvaiul are numarul:"+this.getNrInmatriculare());
    }


}
