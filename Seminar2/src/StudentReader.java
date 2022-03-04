import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends Reader{
    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> aplicanti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student s=new Student();
            readAplicant(input,s);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            s.setAn_studii(an_studii);
            s.setFacultate(facultate);
            aplicanti.add(s);
        }
        input.close();
        return aplicanti;
    }
}
