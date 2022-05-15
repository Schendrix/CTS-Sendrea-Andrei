package state;

public class LaCapatDeLinie implements IState{
    @Override
    public void setStare(Autobuz autobuz) {
        if(!(autobuz.getStare() instanceof LaCapatDeLinie)){
            System.out.println("Autobuzul este la capat"+autobuz.getDenumire());
            autobuz.setStare(this);
        }
    }
}
