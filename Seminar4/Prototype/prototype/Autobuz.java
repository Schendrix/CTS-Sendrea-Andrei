package prototype;

public class Autobuz implements MijlocTransport{
    private String soferAutobuz;

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }

    public String getSoferAutobuz() {
        return soferAutobuz;
    }

    public Autobuz(String soferAutobuz) {
        this.soferAutobuz = soferAutobuz;
    }

    public void setSoferAutobuz(String soferAutobuz) {
        this.soferAutobuz = soferAutobuz;
    }
}
