package observer;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements Subiect{
    List <Observer> observersList;
    String anunt;

    public Autobuz(String anunt) {
        this.observersList = new ArrayList<>();
        this.anunt = anunt;
    }

    @Override
    public void adaugaObsever(Observer observer) {
        observersList.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        observersList.remove(observer);
    }

    @Override
    public void anuntaCalator() {
        observersList.stream().forEach(observer -> observer.primesteAnunt(anunt+observer.toString()));
    }
}
