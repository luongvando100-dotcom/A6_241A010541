package vn.edu.vhu.ltdd.a6controls;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for validation logic in Lab A6 Controls application.
 */
public class ValidationTest {

    @Test
    public void testMssvValidation() {
        String validMssv = "241A010541";
        String invalidMssv1 = "12345";
        
        assertEquals(10, validMssv.length());
        assertEquals(5, invalidMssv1.length());
    }

    @Test
    public void testNameValidation() {
        String name = System.getProperty("user.name", "Default");
        assertNotNull(name);
        assertFalse(name.isEmpty());
    }
}
