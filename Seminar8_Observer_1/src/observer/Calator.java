package observer;

public class Calator implements Observer{
    String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteAnunt(String anunt) {
        System.out.println(anunt);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" ");
        sb.append(nume).append('\'');
        return sb.toString();
    }
}
