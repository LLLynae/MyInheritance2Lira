
/**
 * Lauren Lira - lllira1048
 * CIT 4423 01
 * Nov 06,2022
 * Windows 11
 */

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class MyFrame extends JFrame {/*
                                      * Sets frame up with grid layout,
                                      * and adds all components to it.
                                      */

    GridLayout grid = new GridLayout(6, 5);// Establishes grid size

    MyButton buttonsArray[] = new MyButton[grid.getColumns() * (grid.getRows() - 1)];// Scalable button number
    JPanel panel = new JPanel(grid);
    private final int TICK_MULTIPLIER = 15;/*
                                            * each color button has its own random tick rate,
                                            * this constant scales those tick rates evenly
                                            */
    StartButton startButton = new StartButton(this);
    ColorButton colorButton = new ColorButton(this.buttonsArray);

    public MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1280, 720);
        this.getContentPane().setBackground(Color.BLACK);
        this.setResizable(false);
        // Frame attributes set

        this.add(panel);// panel added

        panel.setBackground(Color.BLACK);// Dark mode established

        for (int i = 0; i < buttonsArray.length; i++) {// For loop for populating button array
            if (i % 1 == 0) {
                buttonsArray[i] = new MyButton(TICK_MULTIPLIER, Color.GREEN, Color.RED);
                buttonsArray[i].showPrimary();
                // Every even element is a green button to start out
            }
            
            panel.add(buttonsArray[i]);
            // adds buttons to panel

        }

        panel.add(startButton);
        // adds the start button to the panel

        panel.add(colorButton.getPrimary());
        panel.add(colorButton.getSecondary());

        setVisible(true);
        // sets frame to visible
    }

    public MyButton getButtonsArray(int index) {// Returns value of array of buttons
        return this.buttonsArray[index];
    }

    public MyButton[] getButtonsArray() {// Returns array of buttons
        return this.buttonsArray;
    }
}// End of Class