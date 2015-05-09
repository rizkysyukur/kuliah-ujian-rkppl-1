import static junit.framework.Assert.assertTrue;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author saeful rizky
 */
public class testing {

    private static Soal s;

    @Before
    public void awalTest() {
        s = new Soal();
        System.out.println("Mengawali testing");
    }

    @Test
    public void testPangkat1() {
        assertSame("Harusnya ", 4, s.pangkat(2, 2));
    }

    @Test
    public void testPangkat2() {
        assertNotSame("Harusnya beda ", 2, s.pangkat(2, 2));
    }

    @Test
    public void testFaktorial1() {
        assertEquals("Harusnya ", 24, s.faktorial(4));
    }

    @Test
    public void testFaktorial2() {
        assertNotEquals("Harusnya beda ", 30, s.faktorial(4));
    }

    @Test
    public void testPerkalian1() {
        assertTrue("Harusnya true", 4 == s.perkalian(2, 2));
    }

    @Test
    public void testPerkalian2() {
        assertFalse("Harusnya false ", 2 == s.perkalian(2, 2));
    }

    @After
    public void akhiriTest() {
        System.out.println("Testing diakhiri");
    }
}
