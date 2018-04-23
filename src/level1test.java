
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class level1test implements ActionListener{
	int counter =(0);
	JFrame window = new JFrame();	
	JPanel glass = new JPanel();
	JButton left = new JButton();
	JButton right = new JButton();
	JButton other = new JButton();
level1test(){
	
window.add(glass);
glass.add(left);
glass.add(right);
glass.add(other);
left.addActionListener(this);
right.addActionListener(this);
other.addActionListener(this);
left.setText("Increment");
right.setText("display");
other.setText("decrement");
window.setVisible(true);
window.pack();


}
public static void main(String[] args) {
level1test jdso = new level1test();
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==left){
counter++;
	}
	if(e.getSource()==other){
		counter--;
	}
	if(e.getSource()==right){
JOptionPane.showMessageDialog(null, counter);
}
	
	
}
}
