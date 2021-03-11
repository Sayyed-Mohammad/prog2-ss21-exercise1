
import org.junit.Test;

import static org.junit.Assert.*;

public class MainClassTest {
    MainClass tester= new MainClass();


    @Test
    public void checckPassword_toSmal(){
        boolean actual = tester.checkLength("asd");
        assertTrue(!actual);
    }
    @Test
    public void checkPasswort_alphaNumerich(){
        boolean actual = tester.checkAlphanumericSymbols("!?/,.?");
        assertTrue(actual);

    }
    @Test
    public void checkPasswordConsecutiveNumber(){
        boolean actual = tester.checkConsecutiveNumberAndSameN("123");
        assertFalse(actual);
    }

    @Test
    public void checkPasswordTheSame(){
        boolean actual = tester.checkConsecutiveNumberAndSameN("111");
        assertFalse(actual);
    }





}
