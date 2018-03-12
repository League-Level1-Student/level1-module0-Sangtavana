/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select â€œCopy Image URLâ€�)

		String a = "http://img.taste.com.au/zuabVVM8/w720-h480-cfill-q80/taste/2016/11/slow-pho-bo-108488-1.jpeg";
		// 2. create a variable of type "Component" that will hold your image
	Component s;
		// 3. use the "createImage()" method below to initialize your Component
s=createImage(a);
		// 4. add the image to the quiz window
 quizWindow.add(s);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String v=JOptionPane.showInputDialog("Where was Pho orginated?");
		// 7. print "CORRECT" if the user gave the right answer
if(v.equalsIgnoreCase("Vietnam")){
	System.out.println("Correct");
}else{
	System.out.println("Incorrect");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(s);
		// 10. find another image and create it (might take more than one line of code)
String a2= "http://3.bp.blogspot.com/_oUHrTawbKHk/TN-txRpkWJI/AAAAAAAABVU/Wi6s2Rtm6iE/s640/Chicken_Noodle_Soup_0513.jpg";
Component s2;
s2=createImage(a2);
		// 11. add the second image to the quiz window
quizWindow.add(s2);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String v2=JOptionPane.showInputDialog("Where was 'Khao Piek' orgininated?");
		// 14+ check answer, say if correct or incorrect, etc.
if(v2.equalsIgnoreCase("Laos")){
	System.out.println("Correct!");
}else{
	System.out.println("Incorrect!");
}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





