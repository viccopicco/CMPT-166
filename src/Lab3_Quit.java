import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;


public class Lab3_Quit extends JFrame implements ActionListener {
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;
	
	private JPanel closePanel;
	
	public static void main (String[] args){
		Lab3_Quit gui = new Lab3_Quit();
		gui.setVisible(true);
	}
	
	public Lab3_Quit(){
		super("Close Program");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout( ));
		
		JLabel label1 = new JLabel("Are you sure?");
		add(label1, BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.LIGHT_GRAY);
		buttonPanel.setLayout(new FlowLayout());
		
		JButton yesButton = new JButton("Yes");
		yesButton.setBackground(Color.red);
		yesButton.addActionListener(this);
		buttonPanel.add(yesButton);
		
		JButton noButton = new JButton("No");
		noButton.setBackground(Color.green);
		noButton.addActionListener(this);
		buttonPanel.add(noButton);
		
		add(buttonPanel, BorderLayout.SOUTH);
	}
	
	public void actionPerformed(ActionEvent e){
		String buttonString = e.getActionCommand();
		
		if (buttonString.equals("Yes"))
			System.exit(0);
		else{
			Lab3_Quit gui = new Lab3_Quit();
			gui.setVisible(false);
		}
	}
	
}
