import java.util.Arrays;

public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nr_proiecte;
    protected String[] denumireProiect;
    public static int pragPunctaj;


    public static void setPragPunctaj(int pragPunctaj) {
        Aplicant.pragPunctaj = pragPunctaj;
    }


    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }


    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void afisereAcceptanta() {
        if (punctaj > pragPunctaj) {
            System.out.println("Aplicantul " + nume + " " + prenume + " a fost acceptat.");
        } else {
            System.out.println("Aplicantul " + nume + " " + prenume + " nu a fost acceptat.");
        }
    }

    public Aplicant() {
        super();
    }

    public void setDenumiriProiecte(int nrProiecte, String[] denumireProiecte) {
        this.nr_proiecte = nrProiecte;
        this.denumireProiect = new String[nrProiecte];
        for (int i = 0; i < nrProiecte; i++) {
            this.denumireProiect[i] = denumireProiecte[i];
        }
    }

    public void afisareSumaFinantare(int suma) {
        System.out.println("Aplicant " + getNume() + " " + getPrenume() + " primeste" + suma + " Euro/zi in proiect.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Nume=").append(nume);
        sb.append(", Prenume=").append(prenume);
        sb.append(", Varsta=").append(varsta);
        sb.append(", Punctaj=").append(punctaj);
        sb.append(", Nr_proiecte=").append(nr_proiecte);
        sb.append(", DenumireProiect=").append(Arrays.toString(denumireProiect));

        return sb.toString();

    }
}
