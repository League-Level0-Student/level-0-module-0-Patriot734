package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
  public static void main(String[] args) {
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
	    int rad;
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	    rad = ran.nextInt(4);
		// 3. Print your variable to the console
	    System.out.println(rad);
		// 4. Get the user to enter something that they think is awesome
	    String mainQuestion = JOptionPane.showInputDialog("What is something that you think is awesome?");
		// 5. If your variable is  0
	    if(rad == 0) 
	    {
	    	String prompt = "I agree, " + mainQuestion + " is awesome";
			JOptionPane.showMessageDialog(null, prompt);
	    	
	    }
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
	    if(rad == 1) 
	    {
	    	String prompt = "Eh " + mainQuestion + " is ok. I guess :-(";
			JOptionPane.showMessageDialog(null, prompt);
	    }
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	    if(rad == 2) 
	    {
	    	String prompt = "Eh " + mainQuestion + " is ok. nevermind it is boring";
			JOptionPane.showMessageDialog(null, prompt);
	    }
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
	    if(rad == 3) 
	    {
	    	String prompt = "What is wrong with you " + mainQuestion + " is boring as all hell. You must be stupid. I bet you have a iq of 1. HAHA get rickrolled. We're no strangers to love\n"
	    			+ "You know the rules and so do I (do I)\n"
	    			+ "A full commitment's what I'm thinking of\n"
	    			+ "You wouldn't get this from any other guy\n"
	    			+ "I just wanna tell you how I'm feeling\n"
	    			+ "Gotta make you understand\n"
	    			+ "Never gonna give you up\n"
	    			+ "Never gonna let you down\n"
	    			+ "Never gonna run around and desert you\n"
	    			+ "Never gonna make you cry\n"
	    			+ "Never gonna say goodbye\n"
	    			+ "Never gonna tell a lie and hurt you\n"
	    			+ "We've known each other for so long\n"
	    			+ "Your heart's been aching, but you're too shy to say it (say it)\n"
	    			+ "Inside, we both know what's been going on (going on)\n"
	    			+ "We know the game and we're gonna play it\n"
	    			+ "And if you ask me how I'm feeling\n"
	    			+ "Don't tell me you're too blind to see\n"
	    			+ "Never gonna give you up\n"
	    			+ "Never gonna let you down\n"
	    			+ "Never gonna run around and desert you\n"
	    			+ "Never gonna make you cry\n"
	    			+ "Never gonna say goodbye\n"
	    			+ "Never gonna tell a lie and hurt you\n"
	    			+ "Never gonna give you up\n"
	    			+ "Never gonna let you down\n"
	    			+ "Never gonna run around and desert you\n"
	    			+ "Never gonna make you cry\n"
	    			+ "Never gonna say goodbye\n"
	    			+ "Never gonna tell a lie and hurt you\n"
	    			+ "We've known each other for so long\n"
	    			+ "Your heart's been aching, but you're too shy to say it (to say it)\n"
	    			+ "Inside, we both know what's been going on (going on)\n"
	    			+ "We know the game and we're gonna play it\n"
	    			+ "I just wanna tell you how I'm feeling\n"
	    			+ "Gotta make you understand\n"
	    			+ "Never gonna give you up\n"
	    			+ "Never gonna let you down\n"
	    			+ "Never gonna run around and desert you\n"
	    			+ "Never gonna make you cry\n"
	    			+ "Never gonna say goodbye\n"
	    			+ "Never gonna tell a lie and hurt you\n"
	    			+ "Never gonna give you up\n"
	    			+ "Never gonna let you down\n"
	    			+ "Never gonna run around and desert you\n"
	    			+ "Never gonna make you cry\n"
	    			+ "Never gonna say goodbye\n"
	    			+ "Never gonna tell a lie and hurt you\n"
	    			+ "Never gonna give you up\n"
	    			+ "Never gonna let you down\n"
	    			+ "Never gonna run around and desert you\n"
	    			+ "Never gonna make you cry\n"
	    			+ "Never gonna say goodbye\n"
	    			+ "Never gonna tell a lie and hurt you";
			JOptionPane.showMessageDialog(null, prompt);
	    }
			// -- invent your own message to give to the user (be nice).

  }

}
	
