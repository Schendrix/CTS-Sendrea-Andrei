package adapter.terestru;

import adapter.terestru.ValideazaTerestruInterfata;

public class ValidatorTerestru implements ValideazaTerestruInterfata {


    @Override
    public void valieadazaBilet() {
        System.out.println("Biletul a fost validat!");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("Abonamentul a fost validat!");
    }



}
