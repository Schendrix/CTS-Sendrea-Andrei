package state;

public class InCursa implements IState{
    @Override
    public void setStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatDeLinie){
            System.out.println("Autobzul cu denumirea: "+autobuz.getDenumire());
        }
    }
}
