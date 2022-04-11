package adapter.main;

import adapter.subteran.ValidatorSubteran;
import adapter.terestru.AdapterObiecte;
import adapter.terestru.ValidatorAdapter;
import adapter.terestru.ValidatorTerestru;

public class Main {
    static void valideazaBiletCalatorie(ValidatorTerestru valid){
        valid.valieadazaBilet();
    }
    public static void main(String[] args) {
        ValidatorTerestru validatorTerestru = new ValidatorTerestru();
        valideazaBiletCalatorie(validatorTerestru);
        ValidatorSubteran validatorSubteran = new ValidatorSubteran();

        AdapterObiecte adapterObiecte = new AdapterObiecte(validatorTerestru);
        valideazaBiletCalatorie(validatorSubteran);

        ValidatorAdapter validatorAdapter = new ValidatorAdapter();
        valideazaBiletCalatorie(validatorAdapter);
    }

}
