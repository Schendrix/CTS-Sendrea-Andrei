package adapter.subteran;

public class ValidatorSubteran implements ValidatorSubteranInterfata{
    @Override
    public void valideazaCalatorie() {
        System.out.println("Calatorira a fost validata!");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("Abonamentul a fost validat!");
    }
}
