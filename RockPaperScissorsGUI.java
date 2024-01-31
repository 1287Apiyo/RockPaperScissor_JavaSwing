import javax.swing.*;

//frontend
public class RockPaperScissorsGUI extends JFrame {
    public RockPaperScissorsGUI(){
        //invoke jframe constructor and add title to the GUI
        super("Rock Pper Scissors");
        //set the size of the GUI
        setSize(450, 574);

        // set layout to null to disable layout management,so we can use absolute positioning for the elements
        setLayout(null);
        //load GUI In the centre of the screen every time we run the application
        setLocationRelativeTo(null);
    }
}
