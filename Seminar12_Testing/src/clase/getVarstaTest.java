package clase;

import exceptii.CNPinvalidException;
import org.junit.Test;

import static org.junit.Assert.*;

public class getVarstaTest {

    @Test
    public void getVarstaWrite(){
        Persoana pM = new Persoana("Andrei","5000226226711");
        assertEquals(22,pM.getVarsta());
    }

    @Test
    public void getVarstaBoundaryInferior(){
        Persoana pM = new Persoana("Andrei","6220226226711");
        assertEquals(0,pM.getVarsta());
    }

    @Test
    public void getVarstaBoundarySuperior(){
        Persoana pM = new Persoana("Andrei","3000101226711");
        assertEquals(222,pM.getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void getVarstaNullException(){
        Persoana pM = new Persoana("Andrei",null);
        pM.getVarsta();
    }

    @Test(expected = CNPinvalidException.class)
    public void getVarstaCNPInvalid(){
        Persoana pM = new Persoana("Andrei","5250101226711");
        pM.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaTimeout(){
        Persoana pM = new Persoana("Andrei","5250101226711");
        pM.getVarsta();
    }

    @Test
    public void getVarstaOrder(){
        Persoana pM = new Persoana("Andrei","5000226226711");
        Persoana pM1 = new Persoana("Andrei","5010226226711");

        assertTrue(pM.getVarsta()>pM1.getVarsta());
    }




}