package prototype;

public class Autobuz implements MijlocTransport{

    public String soferAutobuz;

    public String getSoferAutobuz() {
        return soferAutobuz;
    }

    public void setSoferAutobuz(String soferAutobuz) {
        this.soferAutobuz = soferAutobuz;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException{
        return (MijlocTransport) super.clone();
    }

    public Autobuz(String soferAutobuz) {
        this.soferAutobuz = soferAutobuz;
    }
}
