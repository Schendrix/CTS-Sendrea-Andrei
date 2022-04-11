package adapter.terestru;

import adapter.subteran.ValidatorSubteran;
import adapter.subteran.ValidatorSubteranInterfata;

public class ValidatorAdapter extends ValidatorSubteran implements ValideazaTerestruInterfata {

    @Override
    public void valieadazaBilet() {
        super.valideazaCalatorie();
    }
}
