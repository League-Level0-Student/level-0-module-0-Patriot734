package _03_print_and_popups._4_quiz_game;
import java.util.*;  
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class QuizGame {
	public static void main(String[] args) {
		// stage controls the stage of the setup
		int stage = 0;
		// when stage is zero the intro begins
		// begin is for the start to initalize the program and explain
		String begin = "Hello I am chatty your virtual assistant";
		// printing chatty intro screen
		JOptionPane.showMessageDialog(null, begin);
		// after the user hits ok we will begin the learning process
		String training1 = JOptionPane.showInputDialog("please input a series of texts");
		// printing what they entered
		JOptionPane.showMessageDialog(null, training1 + "\nprocessing. Give me a few seconds");
		int y = 1;
		List<String> list=new ArrayList<String>();  
		list.add("mango");
	    list.add("Apple");  
		list.add("Banana");  
		list.add("Grapes");  
		for(String fruit:list)  
		{e
			  System.out.println(fruit);  
			  
	    }  
	}

}
