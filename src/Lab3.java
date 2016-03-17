import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;

public class Lab3 extends JFrame implements ActionListener{
	public static final int WIDTH = 720;
	public static final int HEIGHT = 480;
	
	private JPanel redPanel;
	private JPanel orangePanel;
	private JPanel yellowPanel;
	private JPanel greenPanel;
	private JPanel bluePanel;
	private JPanel whitePanel;
	
	public static void main(String args[]){
		Lab3 gui = new Lab3();
		gui.setVisible(true);
	}
	public Lab3(){
		super("Panel Demonstration");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel biggerPanel = new JPanel();
		biggerPanel.setLayout(new GridLayout(1, 6));
		
		redPanel = new JPanel();
		redPanel.setBackground(Color.LIGHT_GRAY);
		biggerPanel.add(redPanel);
		
		orangePanel = new JPanel();
		orangePanel.setBackground(Color.LIGHT_GRAY);
		biggerPanel.add(orangePanel);
		
		yellowPanel = new JPanel();
		yellowPanel.setBackground(Color.LIGHT_GRAY);
		biggerPanel.add(yellowPanel);
		
		greenPanel = new JPanel();
		greenPanel.setBackground(Color.LIGHT_GRAY);
		biggerPanel.add(greenPanel);
		
		bluePanel = new JPanel();
		bluePanel.setBackground(Color.LIGHT_GRAY);
		biggerPanel.add(bluePanel);
		
		whitePanel = new JPanel();
		whitePanel.setBackground(Color.LIGHT_GRAY);
		biggerPanel.add(whitePanel);
		
		add(biggerPanel, BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.LIGHT_GRAY);
		buttonPanel.setLayout(new FlowLayout());
		
		JButton redButton = new JButton("Red");
		redButton.setBackground(Color.RED);
		redButton.addActionListener(this);
		buttonPanel.add(redButton);
		
		JButton orangeButton = new JButton("Orange");
		orangeButton.setBackground(Color.ORANGE);
		orangeButton.addActionListener(this);
		buttonPanel.add(orangeButton);
		
		JButton yellowButton = new JButton("Yellow");
		yellowButton.setBackground(Color.YELLOW);
		yellowButton.addActionListener(this);
		buttonPanel.add(yellowButton);
		
		JButton greenButton = new JButton("Green");
		greenButton.setBackground(Color.GREEN);
		greenButton.addActionListener(this);
		buttonPanel.add(greenButton);
		
		JButton blueButton = new JButton("Blue");
		blueButton.setBackground(Color.BLUE);
		blueButton.addActionListener(this);
		buttonPanel.add(blueButton);
		
		JButton whiteButton = new JButton("White");
		whiteButton.setBackground(Color.WHITE);
		whiteButton.addActionListener(this);
		buttonPanel.add(whiteButton);
		
		JButton clearButton = new JButton("Clear");
		clearButton.setBackground(Color.LIGHT_GRAY);
		clearButton.addActionListener(this);
		buttonPanel.add(clearButton);
		
		add(buttonPanel, BorderLayout.SOUTH);
		
		JMenu fileMenu = new JMenu("File");
		
		JMenuItem quitChoice = new JMenuItem("Quit");
		quitChoice.addActionListener(this);
		fileMenu.add(quitChoice);
		
		JMenuBar bar = new JMenuBar( );
		bar.add(fileMenu);
		setJMenuBar(bar);
	}
	public void actionPerformed(ActionEvent e){
		String buttonString = e.getActionCommand();
		Lab3_Quit gui1 = new Lab3_Quit();
		
		if (buttonString.equals("Red"))
			redPanel.setBackground(Color.RED);
		else if (buttonString.equals("Orange"))
			orangePanel.setBackground(Color.ORANGE);
		else if (buttonString.equals("Yellow"))
			yellowPanel.setBackground(Color.YELLOW);
		else if (buttonString.equals("Green"))
			greenPanel.setBackground(Color.GREEN);
		else if (buttonString.equals("Blue"))
			bluePanel.setBackground(Color.BLUE);
		else if (buttonString.equals("White"))
			whitePanel.setBackground(Color.WHITE);
		else if (buttonString.equals("Clear")){
			redPanel.setBackground(Color.LIGHT_GRAY);
			orangePanel.setBackground(Color.LIGHT_GRAY);
			yellowPanel.setBackground(Color.LIGHT_GRAY);
			greenPanel.setBackground(Color.LIGHT_GRAY);
			bluePanel.setBackground(Color.LIGHT_GRAY);
			whitePanel.setBackground(Color.LIGHT_GRAY);
		}
		else if(buttonString.equals("Quit")){
			gui1.setVisible(true);
		}
		else
			System.out.println("Unexpected error.");
	}
}
