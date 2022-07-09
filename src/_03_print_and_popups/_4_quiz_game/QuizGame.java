package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
	    int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
	    String adjective = JOptionPane.showInputDialog("Are the Patriots the greatest fotball team in existance?");
				// 2.  Ask the user a question 
	    if(adjective.contentEquals("yes")) 
	    {
	    	String prompt =  "Correct";
	    	JOptionPane.showMessageDialog(null,prompt);
	    	score = score + 1;
	    }
	    else 
	    {
	    	String prompt =  "You are kinda dumb not gonna lie";
	    	JOptionPane.showMessageDialog(null,prompt);
	    	score = score + 1;
	    }
				// 3.  Use an if statement to check if their answer is correct
	    String question2 = JOptionPane.showInputDialog("Are the Patriots the greatest fotball team in existance?");
		// 2.  Ask the user a question 
if(question2.contentEquals("yes")) 
{
	String prompt =  "Correct";
	JOptionPane.showMessageDialog(null,prompt);
	score = score + 1;
}
else 
{
	String question2 =  "You are kinda dumb not gonna lie";
	JOptionPane.showMessageDialog(null,prompt);
	score = score + 1;
}	
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
