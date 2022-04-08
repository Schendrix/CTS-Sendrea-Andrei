import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        Reader reader = new AngajatReader();
        try {
            listaAngajati = reader.readAplicanti("angajati.txt");
            for (Aplicant aplicant : listaAngajati) {
                System.out.println(aplicant.toString());
                aplicant.afisereAcceptanta();
                aplicant.afisareSumaFinantare(400);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
