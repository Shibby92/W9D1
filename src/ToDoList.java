import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ToDoList {

	public ToDoList(){
		JFrame window= new JFrame();
		window.setSize(720, 1280);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel= new JPanel();
		window.setContentPane(panel);
		panel.setLayout(new BorderLayout());
		JPanel leftPanel= new JPanel();
		panel.add(leftPanel, BorderLayout.WEST);
		window.setVisible(true);
	}

}
