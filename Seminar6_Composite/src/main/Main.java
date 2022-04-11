package main;

import composite.Autobuz;
import composite.Composite;

public class Main {

    public static void main(String[] args) {
        Autobuz autobuzMic1 = new Autobuz("Mercedes","A1",10);
        Autobuz autobuzMic2 = new Autobuz("Mercedes","A1",9);
        Autobuz autobuzMic3 = new Autobuz("Mercedes","A1",5);
        Autobuz autobuzMediu1 = new Autobuz("Mercedes","A1",12);
        Autobuz autobuzMediu2 = new Autobuz("Mercedes","A1",15);
        Autobuz autobuzMediu3 = new Autobuz("Mercedes","A1",20);
        Autobuz autobuzMare1 = new Autobuz("Mercedes","A1",22);
        Autobuz autobuzMare2 = new Autobuz("Mercedes","A1",25);
        Autobuz autobuzMare3 = new Autobuz("Mercedes","A1",30);

        Composite compositeMica= new Composite("FLoata Mica");
        Composite compositeMedie = new Composite("Flota Medie");
        Composite compositeMare = new Composite("Flota Mare");

        Composite compositeFlota = new Composite("Flota Mama");

        try {
            compositeMica.adaugaItem(autobuzMic1);
            compositeMica.adaugaItem(autobuzMic2);
            compositeMica.adaugaItem(autobuzMic3);

            compositeMedie.adaugaItem(autobuzMediu1);
            compositeMedie.adaugaItem(autobuzMediu2);
            compositeMedie.adaugaItem(autobuzMediu3);

            compositeMare.adaugaItem(autobuzMare1);
            compositeMare.adaugaItem(autobuzMare2);
            compositeMare.adaugaItem(autobuzMare3);

            compositeFlota.adaugaItem(compositeMica);
            compositeFlota.adaugaItem(compositeMedie);
            compositeFlota.adaugaItem(compositeMare);

            //Afisare flota mare
            compositeFlota.descrieItem();
            System.out.println();

            //Stergere element
            compositeFlota.stergeItem(compositeMedie);

            //Afisare flota mare
            compositeFlota.descrieItem();

            //Afisare sumaGarantata
            System.out.println("Suma totala garantata"+compositeFlota.calculeazaSumaGarantata(3));

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

    }







