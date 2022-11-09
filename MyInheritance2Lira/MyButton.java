
/**
 * Lauren Lira - lllira1048
 * CIT 4423 01
 * Nov 06,2022
 * Windows 11
 */

import ovalbutton.*;
import ovalbutton.OvalButton;
import java.awt.Color;

public class MyButton extends OvalButton {/*
                                           * Class for setting the color of button object to be later
                                           * called in array
                                           */

    private int currentColor;
    private int tick;
    private Color primary;
    private Color secondary;

    public MyButton(int tickMultiplier, Color startColor, Color startSecond) {// constructor for the class,
                                                                              // calls methods
        super(OvalButton.SHAPE_OVAL, OvalButton.HORIZONTAL, startColor, startSecond, Color.BLACK, Color.BLACK);
        this.primary = startColor;//starting color
        this.secondary = startSecond;//highlighter color

        this.tick = (int) (Math.random() * 20) * tickMultiplier;// implements tickMultiplier on all buttons in array

    }

    // Setters
    public void showSecondary() {// Sets button to red
        this.setCurrentBackground(secondary);
        this.setBackground(secondary);
    }

    public void showPrimary() {// Sets button to green
        this.setColorNormal(primary);
        this.setCurrentBackground(primary);
    }

    public void switchColor() throws InterruptedException {// Switches the color of the current button by changing its
                                                           // first and highlight color
        if (this.getCurrentColor() == secondary) {
            this.showPrimary();
        } else if (this.getCurrentColor() == primary) {
            this.showSecondary();
        } else if (getCurrentColor() != secondary || this.getCurrentColor() != primary) {
            this.setCurrentBackground(primary);
        }
        this.paint(getGraphics());// Allows repaint to happen immediately
    }

    // Getters
    public int getTick() {// Gets tick integer
        return this.tick;
    }

    public Color getPrimary() {
        return this.primary;
    }

    public Color getSecondary() {
        return this.secondary;
    }

    public void setPrimary(Color primary) {
        this.primary = primary;
    }

    public void setSecondary(Color secondary) {
        this.secondary = secondary;
    }
}// End of class