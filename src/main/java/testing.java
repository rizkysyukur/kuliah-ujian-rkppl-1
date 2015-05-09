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
        assertSame("Harusnya ", 24, s.faktorial(4));
    }

    @Test
    public void testFaktorial2() {
        assertNotSame("Harusnya beda ", 30, s.faktorial(4));
    }
    
//    public static void main(String[] args) {
//        Soal s = new Soal();
//        System.out.println(s.faktorial(4));
//    }

}
