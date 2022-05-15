package command;

public class ComandaPleacaInCursa implements ICommanda{
    int nrLinie;
    Autobuz autobuz;

    public ComandaPleacaInCursa(int nrLinie, Autobuz autobuz) {
        this.nrLinie = nrLinie;
        this.autobuz = autobuz;
    }

    @Override
    public void executa() {
        autobuz.pleacaInCursa();
    }
}
