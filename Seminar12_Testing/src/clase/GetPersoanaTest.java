package clase;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetPersoanaTest {
    @Test
    public void fetSexRight(){
        Persoana pM=new Persoana("Andrei","5000226226711");
        assertEquals("M",pM.getSex());
    }

    @Test(timeout = 100)
    public void performanceTest(){
        Persoana pM=new Persoana("Andrei","5000226226711");
        pM.getSex();
    }

    @Test
    public void conformanceTest(){
        Persoana pM=new Persoana("Andrei","5000226226711");
        assertEquals(1,pM.getSex().length());
    }

//    //Se aplica mai mult la liste
//    @Test
//    public void orderTest(){
//
//    }

    @Test
    public void getSexRangeTest(){
        Persoana pM=new Persoana("Andrei","7000226226711");
        assertEquals("N/A",pM.getSex());
    }

//    //Se apeleaza cand apelam alte metode/referinte
//    @Test
//    public void getSexReference(){
//
//    }

    @Test
    public void getSexExistence(){
        Persoana pM=new Persoana("Andrei","5000226226711");

    }

}