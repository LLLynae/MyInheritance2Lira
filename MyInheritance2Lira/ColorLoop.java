/**
 * Lauren Lira - lllira1048
 * CIT 4423 01
 * Nov 06,2022
 * Windows 11
 */

public class ColorLoop extends Thread {/*
                                        * Class for looping through alternating colors using
                                        * a thread. The colors will randomly alternate between red and green.
                                        */

    private MyFrame theFrame;// Declares the object of a class

    public ColorLoop(MyFrame frame) {
        this.setDaemon(true);// Set to true, makes loop stop when program exits
        this.setPriority(MIN_PRIORITY);// Loop priority set
        this.theFrame = frame;// Sets theFrame equal to frame object
    }

    @Override
    public void run() {// Override to run loop
        try {// try catch to interrupt loop
            while (true) {// Sets to a random button within array, randomizing the color changes
                int random = (int) (Math.random() * theFrame.getButtonsArray().length);// integer for randomizing
                theFrame.getButtonsArray(random).switchColor();
                Thread.sleep(this.theFrame.getButtonsArray(random).getTick());// Enables thread to be paused
            }
        } catch (InterruptedException e) {
            this.interrupt();// Enables loop to be interrupted
        } catch (Exception e) {
            System.out.println(e.getMessage());// Error catch message
        }

    }// End of class ColorLoop
}