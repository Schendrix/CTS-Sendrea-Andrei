package memento;

public class Memento {
    private String numeSofer;
    private double consum;

    public Memento(String numeSofer, double consum) {
        this.numeSofer = numeSofer;
        this.consum = consum;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public double getConsum() {
        return consum;
    }

    public void setConsum(double consum) {
        this.consum = consum;
    }
}
