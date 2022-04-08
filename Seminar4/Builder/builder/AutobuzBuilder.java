package builder;

public class AutobuzBuilder implements BuilderAbstract{
    private Autobuz instanta;

    @Override
    public Autobuz build() {
        return instanta;
    }

    public AutobuzBuilder() {
        this.instanta=new Autobuz();
    }

    public AutobuzBuilder setModel(String model) {
        instanta.setModel(model);
        return this;
    }

    public AutobuzBuilder setSofer(String sofer) {
        instanta.setSofer(sofer);
        return this;
    }

    public AutobuzBuilder setOprireCapat(boolean oprireCapat) {
        instanta.setOprireCapat(oprireCapat);
        return this;
    }

    public AutobuzBuilder setDeschideUsi(boolean deschideUsi) {
        instanta.setDeschideUsi(deschideUsi);
        return this;
    }

    public AutobuzBuilder setTextDerulat(String textDerulat) {
        instanta.setTextDerulat(textDerulat);
        return this;
    }

    public AutobuzBuilder setNrInmatriculare(String nrInmatriculare) {
        instanta.setNrInmatriculare(nrInmatriculare);
        return this;
    }
}
