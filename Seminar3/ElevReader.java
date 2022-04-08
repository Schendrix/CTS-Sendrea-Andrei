import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends Reader{
    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (scanner.hasNext()) {
            Elev e=new Elev();
            readAplicant(scanner,e);
            int clasa = scanner.nextInt();
            String tutore = scanner.next();
            e.setClasa(clasa);
            e.setTutore(tutore);
            elevi.add(e);
        }
        scanner.close();
        return elevi;
    }
}
