package state;

public class LaReparat implements IState{
    @Override
    public void setStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatDeLinie){
            System.out.println("Autobzul");
            autobuz.setStare(this);
        }
    }
}
