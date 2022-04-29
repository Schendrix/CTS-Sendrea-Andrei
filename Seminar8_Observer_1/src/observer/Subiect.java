package observer;

public interface Subiect {
    public void adaugaObsever(Observer observer);
    public void stergeObserver(Observer observer);

    public void anuntaCalator();
}
