package command;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    List<ICommanda> commandaList=new ArrayList<>();
    public void invocaComanda(){
        if(!commandaList.isEmpty()){
        commandaList.get(0).executa();
        commandaList.remove(0);}
        else{
            System.out.println("Operatorul nu mai are comenzi!");
        }
    }


    public void adaugaCommand(ICommanda commanda){
        commandaList.add(commanda);
    }
}
