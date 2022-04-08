package builder;

public class Autobuz {
    private String model;
    private String sofer;
    private boolean oprireCapat;
    private boolean deschideUsi;
    private String textDerulat;
    private String nrInmatriculare;

    public Autobuz() {
        this.model = "modelDefault";
        this.sofer = "soferDefault";
        this.oprireCapat = true;
        this.deschideUsi = true;
        this.textDerulat = "textDefault";
        this.nrInmatriculare = "numarDefault";
    }

    void setModel(String model) {
        this.model = model;
    }

    void setSofer(String sofer) {
        this.sofer = sofer;
    }

    void setOprireCapat(boolean oprireCapat) {
        this.oprireCapat = oprireCapat;
    }

    void setDeschideUsi(boolean deschideUsi) {
        this.deschideUsi = deschideUsi;
    }

    void setTextDerulat(String textDerulat) {
        this.textDerulat = textDerulat;
    }

    void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", sofer='").append(sofer).append('\'');
        sb.append(", oprireCapat=").append(oprireCapat);
        sb.append(", deschideUsi=").append(deschideUsi);
        sb.append(", textDerulat='").append(textDerulat).append('\'');
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
