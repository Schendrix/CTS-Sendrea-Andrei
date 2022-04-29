package strategy;

public class ValidatorCalatorii {
    private ModPlata modPlata;
    private double pret;

    public ValidatorCalatorii(double pret) {
        this.pret = pret;
        this.modPlata = new CardCalatorii();
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void platesteCalatorie(){
        modPlata.plateste(pret);
    }
}
