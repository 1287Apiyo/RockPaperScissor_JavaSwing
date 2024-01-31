import javax.swing.*;
import java.awt.*;

//frontend
public class RockPaperScissorsGUI extends JFrame {
    //player buttons
    JButton rockButton,paperButton,scissorButton;
    public RockPaperScissorsGUI(){
        //invoke jframe constructor and add title to the GUI
        super("Rock Paper Scissors");
        //set the size of the GUI
        setSize(450, 574);

        // set layout to null to disable layout management,so we can use absolute positioning for the elements
        setLayout(null);

        //terminate the java virtual machine when closing the gui
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //load GUI In the centre of the screen every time we run the application
        setLocationRelativeTo(null);
        // addGuiComponents
        addGuiComponents();
    }
    private void
    addGuiComponents(){
       //create comp score label
       JLabel computerScoreLabel = new JLabel("Computer:0");

       //set coordinate values
        computerScoreLabel.setBounds(0,43,450,30);
        //set the font
        computerScoreLabel.setFont(new Font("Dialog", Font.BOLD,26));

        //place the text in the centre
        computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //add to GUI
        add(computerScoreLabel);

        //create a computer choice
        JLabel computerChoice=new JLabel("?");
        computerChoice.setBounds(175,118,98,81);
        computerChoice.setFont(new Font("Dialog",Font.PLAIN,18));
        computerChoice.setHorizontalAlignment(SwingConstants.CENTER);

        //create a black border around
        computerChoice.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(computerChoice);

        //create player score label

        JLabel playerScoreLabel = new JLabel("Player:0");
        playerScoreLabel.setBounds(0,317,450,30);
        playerScoreLabel.setFont(new Font("Dialog",Font.BOLD,26));

        playerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(playerScoreLabel);

        //player buttons
       //rock buttons
        rockButton=new JButton("Rock");
        rockButton.setBounds(40,387,105, 81);
        rockButton.setFont(new Font("Dialog",Font.PLAIN,18));
        add(rockButton);

        //paper buttons
        paperButton=new JButton("Paper");
        paperButton.setBounds(165,387,105, 81);
        paperButton.setFont(new Font("Dialog",Font.PLAIN,18));
        add(paperButton);

        //scissors button
        scissorButton=new JButton("Scissors");
        scissorButton.setBounds(290,387,105, 81);
        scissorButton.setFont(new Font("Dialog",Font.PLAIN,18));
        add(scissorButton);


    }
    }


