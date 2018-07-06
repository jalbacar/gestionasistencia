package gestion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GestionTest {

    @Before
    public void setUp(){
        System.out.println("Inicio de Testy");
    }

    @Test
    public void creacionGestor(){
        Gestion g = new Gestion();
        assert g != null;
    }

    @After
    public void tearDown(){
        System.out.println("End");
    }


}
