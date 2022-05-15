package memento;

public class Autobuz {
    public String denumire;
    public double consum;
    public String model;
    public int nrLocuri;

    public Autobuz(String denumire, double consum, String model, int nrLocuri) {
        this.denumire = denumire;
        this.consum = consum;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setConsum(double consum) {
        this.consum = consum;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", consum=").append(consum);
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }

    public Memento save(){
        Memento autobuzMemento = new Memento(this.denumire,this.consum);
        return  autobuzMemento;
    }

    public void undo(Memento memento){
        this.denumire=memento.getNumeSofer();
        this.consum=memento.getConsum();
    }
}
