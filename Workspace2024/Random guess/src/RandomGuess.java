// Cody Marsh 1/16/2024 Web Assist 1
import javax.swing.JOptionPane;
public class RandomGuess {

	public static void main(String[] args) {
			int randNum = (int)(Math.random() * 10 + 1);
			String getGuess = JOptionPane.showInputDialog("Guess a number between 1 and 10,\n\n");
			int guess = Integer.parseInt(getGuess);
			String response;
			if (guess == randNum) {
				response = "You are CORRECT!!!";
			}else{
				response = "Better luck next time, the correct number was " + randNum;
			}
			JOptionPane.showMessageDialog(null, response);
	
			}
		
		
		

	}


