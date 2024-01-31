import javax.swing.*;

public class App {
    public static void main(String[]args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
              //instantiate a rockpaperscissor gui
              RockPaperScissorsGUI rockPaperScissorsGUI=new RockPaperScissorsGUI();

              //display the gui
                rockPaperScissorsGUI.setVisible(true);
            }
        });
    }
}
