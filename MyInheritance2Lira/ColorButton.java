/**
 * Lauren Lira - lllira1048
 * CIT 4423 01
 * Nov 06,2022
 * Windows 11
 */

import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.Color;

public class ColorButton {/*Class to establish two buttons, one ot change primary color and one to change the 
    the secondary color. Press mehtods are implemented so actionlistener will pull up color changer dialog box,
    and allow user to select a color.*/

    JButton primary = new JButton("Change Primary\n Color");
    JButton secondary = new JButton("Change Secondary\n Color");
    MyButton[] buttons;
    //Objects instantiated

    public ColorButton(MyButton[] buttons) {/*Constructor to establish buttons*/
        this.buttons = buttons;

        secondary.setBackground(Color.WHITE);
        secondary.setSize(100, 100);
        //perameters

        secondary.addActionListener(e -> press());// Adds actionListener to Start button

        primary.setBackground(Color.WHITE);
        primary.setSize(100, 100);
        //perameters

        primary.addActionListener(e -> press2());// Adds actionListener to Start button
    }

    private void press() {/*Method for pulling up color chooser dialog box on primary color button. Applies
        this to array of buttons. */
        Color primaryColor = JColorChooser.showDialog(null, "Select a Color", Color.white);
        if (primaryColor != null) {
            for (int i = 0; i < buttons.length; i++) {
                buttons[i].setPrimary(primaryColor);
            }
        }
    }

    private void press2() {/*Method for pulling up color chooser dialog box on secondary color button. Applies
        this to array of buttons. */
        Color secondaryColor = JColorChooser.showDialog(null, "Select a Color", Color.white);
        if (secondaryColor != null) {
            for (int i = 0; i < buttons.length; i++) {
                buttons[i].setSecondary(secondaryColor);
            }
        }
    }

    //Getters
    public JButton getPrimary() {
        return primary;
    }

    public JButton getSecondary() {
        return secondary;
    }

}//End of ColorButton class
