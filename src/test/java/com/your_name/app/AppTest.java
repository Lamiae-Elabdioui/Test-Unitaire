package com.your_name.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Test unitaire pour la classe App.
 */
public class AppTest {
    
    @Test
    public void testSomme() {
        App app = new App();
        int resultatAddition = app.somme(5, 6);
        assertEquals(10, resultatAddition); 
    }
}
