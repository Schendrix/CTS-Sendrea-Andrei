package state;

public class Autobuz {
    int denumire;
    IState stare;

    public Autobuz() {
    }

    public Autobuz(int denumire, IState stare) {
        this.denumire = denumire;
        this.stare = stare;
    }

    public int getDenumire() {
        return denumire;
    }

    public void setDenumire(int denumire) {
        this.denumire = denumire;
    }

    public IState getStare() {
        return stare;
    }

    public void setStare(IState stare) {
        this.stare = stare;
    }

    public void puneInPlecare(){
        IState iState = new InCursa();
        iState.setStare(this);
    }

    public void puneInReparatie(){
        IState iState = new LaReparat();
        iState.setStare(this);
    }

    public void laCapatDeLinie(){
        IState iState = new LaCapatDeLinie();
        iState.setStare(this);
    }
}
