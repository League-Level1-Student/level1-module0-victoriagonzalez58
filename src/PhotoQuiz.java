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
String grass = ("https://kids.nationalgeographic.com/content/dam/kids/photos/animals/Mammals/H-P/hedgehog-closeup.adapt.945.1.jpg");
		// 2. create a variable of type "Component" that will hold your image
Component hedge;
		// 3. use the "createImage()" method below to initialize your Component
hedge = createImage(grass);
		// 4. add the image to the quiz window
quizWindow.add(hedge);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String ans1 = JOptionPane.showInputDialog("which animal is called hoglet as a baby?");
		// 7. print "CORRECT" if the user gave the right answer
if(ans1.equals("Hedgehog")){JOptionPane.showMessageDialog(null, "CORRECT");}else{JOptionPane.showMessageDialog(null, "INCORRECT");}
// 8. print "INCORRECT" if the answer is wrong
quizWindow.remove(hedge);
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)

// 10. find another image and create it (might take more than one line of code

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

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





