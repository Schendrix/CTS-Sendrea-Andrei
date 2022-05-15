package chainofresponsabilty;

public class TramvaiHandler extends MijlocTransportHandler{
    @Override
    public void recomandaMijloc(double distanta) {
        if(distanta<10)
            System.out.println("Se recomand tramvaiul!");
        else{
            getMijlocTransportHandler().recomandaMijloc(distanta);
        }
    }
}
