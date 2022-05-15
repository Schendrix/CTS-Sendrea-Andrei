package chainofresponsabilty;

public abstract class MijlocTransportHandler {
    MijlocTransportHandler mijlocTransportHandler;
    double limitaSupl

    public MijlocTransportHandler getMijlocTransportHandler() {
        return mijlocTransportHandler;
    }

    public MijlocTransportHandler(int limitaSupl) {
        this.mijlocTransportHandler=null;
    }

    public abstract void recomandaMijloc(double distanta);
}
