import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		JFrame myFrame = new JFrame("Ivan Santiago De Jesus");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setSize(200, 200); 
		myFrame.setLocation((int)((screenSize.getWidth()-myFrame.getWidth())/2), (int)((screenSize.getHeight()-myFrame.getHeight())/2));
		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
	}
}