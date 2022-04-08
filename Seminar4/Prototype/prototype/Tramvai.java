package prototype;

public class Tramvai implements MijlocTransport{
    private String vatman;

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }

    public String getVatman() {
        return vatman;
    }
}
