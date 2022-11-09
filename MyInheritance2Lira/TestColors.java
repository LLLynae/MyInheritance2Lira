/**
 * Lauren Lira - lllira1048
 * CIT 4423 01
 * Nov 06,2022
 * Windows 11
 */

import static org.junit.Assert.assertEquals;
import java.awt.Color;

import org.junit.*;

public class TestColors {// Class to test color change
    @Test
    public void testColors() {

        MyButton test = new MyButton(0, Color.GREEN, Color.RED);
        try {
            test.switchColor();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(test.getSecondary(), test.getCurrentColor());
        assertEquals(0, test.getTick(), 20);

     }//Tests whether color switch method is running correctly or not
}// End of class