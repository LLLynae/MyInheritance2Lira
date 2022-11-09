/**
 * Lauren Lira - lllira1048
 * CIT 4423 01
 * Nov 06,2022
 * Windows 11
 */

import javax.swing.JButton;
import java.awt.Color;

public class StartButton extends JButton {// Makes start JButton
    ColorLoop cLoop;// Declares ColorLoop object
    MyFrame theFrame;// Declares MyFrame object

    public StartButton(MyFrame theFrame) {// Establishes start button and attributes
        this.setText("Start");
        this.setBackground(Color.WHITE);
        this.setSize(100, 100);
        this.theFrame = theFrame;
        this.cLoop = new ColorLoop(this.theFrame);// Adds loop
        this.addActionListener(e -> press());// Adds actionListener to Start button
    }

    private void switchText() {// Method for switching button text depending on what string says
        if (this.getText().equalsIgnoreCase("Start")) {
            this.setText("Stop");
        } else {
            this.setText("Start");
        }
    }

    private void press() {/*
                           * Switches text on button depending on if the text says start or stop
                           * and applies it to the loop
                           */
        if (this.getText().equalsIgnoreCase("Start")) {
            cLoop.start();
            this.switchText();
        } else {
            cLoop.interrupt();
            this.switchText();
            cLoop = new ColorLoop(this.theFrame);
        }
    }
}// End of class