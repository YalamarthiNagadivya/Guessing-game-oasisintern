
import java.util.Random;

import javax.swing.JOptionPane;

public class Launcher3 {
  public static void main(String[] args) {

    int exit = 0, score = 0, round = 0, limit = 10;

    while (exit != 1) {

      round++;

      Random randomNumber = new Random();

      int answer = randomNumber.nextInt(100);

      boolean gameover = true;

      int chances = 0, iterator = 0;

      while (gameover) {
        String number = JOptionPane.showInputDialog("Enter Your number :");

        String message = "";
        Integer userInput = Integer.valueOf(number);

        if (userInput == answer) {
          message = "You got the correct number.";
          score++;
          break;
        } else if (userInput > 100 || userInput < 0) {
          message = "Not a valid entry";
        } else if (userInput < answer) {
          message = "You got number lesser";
        } else if (userInput > answer) {
          message = "You got number greater";
        }

        iterator++;
        chances = limit - iterator;
        JOptionPane.showMessageDialog(null, message + "\nLeft attempts : " + chances);
        if (iterator == limit) {
          gameover = false;
        }
      }
      JOptionPane.showMessageDialog(null, "Your score is : " + score);
      exit = JOptionPane.showConfirmDialog(null, "Do you want to continue ? ");

      if (chances == 0) {
        JOptionPane.showMessageDialog(null, "The answer is : " + answer);
      }
    }
    JOptionPane.showMessageDialog(null, "Hurray ! Your final score in " + round + " rounds is " + score);
  }
}
