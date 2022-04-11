package composite;

public class Autobuz implements InterfataItem{
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz() {
    }

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }


    @Override
    public void adaugaItem(InterfataItem interfataItem) throws Exception {
        throw new Exception("Ilegal!");
    }

    @Override
    public void stergeItem(InterfataItem interfataItem) throws Exception {
        throw new Exception("Nu e voie!");
    }

    @Override
    public void descrieItem() {
        System.out.println(this.toString());
    }

    @Override
    public InterfataItem getItem(int pozitie) throws Exception {
        throw new Exception("Nu!");
    }

    @Override
    public float calculeazaSumaGarantata(float pretPerLoc) {
        return pretPerLoc*nrLocuri + model.length();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("producator='").append(producator).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
