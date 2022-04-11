package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements InterfataItem{
    private String denumire;
    private List<InterfataItem> interfataItemList=new ArrayList<>();

    public Composite(String denumire, List<InterfataItem> interfataItemList) {
        this.denumire = denumire;
        this.interfataItemList = interfataItemList;
    }

    public Composite(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaItem(InterfataItem interfataItem) throws Exception {
        interfataItemList.add(interfataItem);
    }

    @Override
    public void stergeItem(InterfataItem interfataItem) throws Exception {
        interfataItemList.remove(interfataItem);
    }

    @Override
    public void descrieItem() {
        System.out.println(denumire);
        for(InterfataItem interfataItem: interfataItemList){
            interfataItem.descrieItem();
        }
    }

    @Override
    public InterfataItem getItem(int pozitie) throws Exception {
        return interfataItemList.get(pozitie);
    }

    @Override
    public float calculeazaSumaGarantata(float pretPerLoc) {
        float suma=0;
        for(InterfataItem interfataItem: interfataItemList){
            suma+=interfataItem.calculeazaSumaGarantata(pretPerLoc);
        }
        return suma;
    }
}
