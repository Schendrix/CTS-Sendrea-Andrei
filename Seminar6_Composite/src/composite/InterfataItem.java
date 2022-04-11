package composite;

public interface InterfataItem {
    void adaugaItem(InterfataItem interfataItem) throws Exception;
    void stergeItem(InterfataItem interfataItem) throws Exception;
    void descrieItem();
    InterfataItem getItem(int pozitie) throws Exception;
    float calculeazaSumaGarantata(float pretPerLoc);
}
