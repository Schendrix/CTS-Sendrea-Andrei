package memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuze {
    List<Memento> mementoList= new ArrayList<>();



    public ManagerAutobuze(List<Memento> mementoList) {
        this.mementoList = mementoList;
    }

    public ManagerAutobuze() {

    }

    public void adaugaMemento(Memento memento){
        mementoList.add(memento);
    }
    public Memento getMemento(int poz){
        return mementoList.get(poz);
    }
}
