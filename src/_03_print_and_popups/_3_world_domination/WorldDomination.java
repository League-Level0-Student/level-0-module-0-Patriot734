package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String adjective = JOptionPane.showInputDialog("Do you know how to code?");
		// 2. If they say "yes", tell them they will rule the world.
if(adjective.contentEquals("yes")) 
{
	String prompt =  "You will rule the world";
	JOptionPane.showMessageDialog(null,prompt);
}
else 
{
	String prompt =  "You should sign up for classes at the league of amazing programmers";
	JOptionPane.showMessageDialog(null,prompt);
}
		// 3. Otherwise, tell them to sign up for classes at The League.

	}
}

