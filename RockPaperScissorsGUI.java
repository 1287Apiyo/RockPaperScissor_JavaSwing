import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//frontend
public class RockPaperScissorsGUI extends JFrame implements ActionListener{
    //player buttons
    JButton rockButton,paperButton,scissorButton;
    //will display the choice of the computer

    JLabel computerChoice;

    JLabel computerScoreLabel,playerScoreLabel;
    //backend obj
    RockPaperScissors rockPaperScissors;
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

        //initialize  the backend project
        rockPaperScissors=new RockPaperScissors();
        // addGuiComponents
        addGuiComponents();
    }
    private void
    addGuiComponents(){
       //create comp score label
        computerScoreLabel = new JLabel("Computer:0");

       //set coordinate values
        computerScoreLabel.setBounds(0,43,450,30);
        //set the font
        computerScoreLabel.setFont(new Font("Dialog", Font.BOLD,26));

        //place the text in the centre
        computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //add to GUI
        add(computerScoreLabel);

        //create a computer choice
         computerChoice=new JLabel("?");
        computerChoice.setBounds(175,118,98,81);
        computerChoice.setFont(new Font("Dialog",Font.PLAIN,18));
        computerChoice.setHorizontalAlignment(SwingConstants.CENTER);

        //create a black border around
        computerChoice.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(computerChoice);

        //create player score label

        playerScoreLabel = new JLabel("Player:0");
        playerScoreLabel.setBounds(0,317,450,30);
        playerScoreLabel.setFont(new Font("Dialog",Font.BOLD,26));

        playerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(playerScoreLabel);

        //player buttons
       //rock buttons
        rockButton=new JButton("Rock");
        rockButton.setBounds(40,387,105, 81);
        rockButton.setFont(new Font("Dialog",Font.PLAIN,18));
        rockButton.addActionListener(this);
        add(rockButton);

        //paper buttons
        paperButton=new JButton("Paper");
        paperButton.setBounds(165,387,105, 81);
        paperButton.setFont(new Font("Dialog",Font.PLAIN,18));
        paperButton.addActionListener(this);

        add(paperButton);

        //scissors button
        scissorButton=new JButton("Scissors");
        scissorButton.setBounds(290,387,105, 81);
        scissorButton.setFont(new Font("Dialog",Font.PLAIN,18));
        scissorButton.addActionListener(this);

        add(scissorButton);

    }

    //displays a message which will show the winner and a try again button to play again
    private void showDialog(String message){
        JDialog resultDialog=new JDialog(this,"Result",true);
        resultDialog.setSize(227,124);
        resultDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        resultDialog.setResizable(false);

        //message label

        JLabel resultLabel =new JLabel(message);
        resultLabel.setFont(new Font("Dialog",Font.BOLD,18));
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resultDialog.add(resultLabel,BorderLayout.CENTER);

//try again button
        JButton tryAgainButton = new JButton("Try Again");
       tryAgainButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               //reset computer choice
               computerChoice.setText("?");

               //close the dialog box
               resultDialog.dispose();



           }
       });


       resultDialog.add(tryAgainButton,BorderLayout.SOUTH);
       resultDialog.setLocationRelativeTo(this);
       resultDialog.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         //get player choice
        String playerChoice =e.getActionCommand().toString();
        //play game and store results into string var


        String result= rockPaperScissors.playRockPaperScissor(playerChoice);

        //load computers choice
        computerChoice.setText(rockPaperScissors.getComputerChoice());

        //update score
        computerScoreLabel.setText("Computer; "+rockPaperScissors.getComputerScore());
        playerScoreLabel.setText("Player: "+rockPaperScissors.getPlayerScore());

        //display result dialog
        showDialog(result);
    }
}


