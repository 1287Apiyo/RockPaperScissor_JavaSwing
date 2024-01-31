//backend

import java.util.Random;

public class RockPaperScissors {
//all the choices a computer can choose
    private static String[] computerChoices ={"Rock","Paper","Scissors"};

    private String computerChoice;

    public String getComputerChoice() {
        return computerChoice;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    ///store the scores so that we can retrieve the values and display it to the frontend
    private int computerScore, playerScore;

    //used to generate  a random number to randomly choose an option for the computer
    private Random random;
    //constructor to instantiate random object
    public RockPaperScissors(){
        random=new Random();
    }
//call this method to begin playing the game
    public String playRockPaperScissor(String playerChoice){
      //generate comp choice
       computerChoice=computerChoices[random.nextInt(computerChoices.length)];

       //will contain the returning message
                String result;
        //evaluate the winner
        if (computerChoice.equals("Rock")){
            if (playerChoice.equals("Paper")){
                result="Player wins";
                playerScore++;
            } else if (playerChoice.equals("Scissors")) {
                result="Computer wins";
                computerScore++;
                
            }else {
                result="Draw";
            }
        }else if (computerChoice.equals("Paper")) {
            if (playerChoice.equals("Scissors")) {
                result = "Player wins";
                playerScore++;
            } else if (playerChoice.equals("Rock")) {
                result = "Computer wins";
                computerScore++;

            } else {
                result = "Draw";
            }
        }else {
            //computer chooses scissors
            if (playerChoice.equals("Rock")) {
                result = "Player wins";
                playerScore++;
            } else if (playerChoice.equals("Paper")) {
                result = "Computer wins";
                computerScore++;

            } else {
                result = "Draw";
            }
        }
        return result;
    }
}
