import java.awt.event.*;

import javax.swing.*;

public class jframe {
	public static JTextField _result = new JTextField();
	public static JTextField tf=new JTextField();  
	public static JTextField comDisplay = new JTextField();
	public static void main (String[]args) {
		JFrame jf= new JFrame();
		
		//final JTextField result = new JTextField();
	JButton buttonrock= new JButton("Rock");
	buttonrock.setBounds(150, 150, 150, 50);
	jf.add(buttonrock);
	buttonrock.addActionListener(new ActionListener()
			{
		
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					eventClick("Rock");
				}});
	JButton buttonscissors = new JButton("Scissors");
	buttonscissors.setBounds(400,150,150,50);
	jf.add(buttonscissors);
	buttonscissors.addActionListener(new ActionListener()
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			eventClick("Scissors");
		}});
	
	JButton buttonpaper = new JButton("Paper");
	buttonpaper.setBounds(300,300,150,50);
	jf.add(buttonpaper);
	buttonpaper.addActionListener(new ActionListener()
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			eventClick("Paper");
		}});
	
	jf.setSize(700, 700);	
	jf.add(tf);
	jf.setTitle("RockPaperScissors");
	jf.setVisible(true);
	jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	jf.add(comDisplay);
	jf.add(_result);
	} 
	public static void eventClick(String yourChoice) {
		tf.setBounds(0, 400, 230, 230);
		playerset ps= new playerset(yourChoice); 
		tf.setText("YOU CHOSE: "+ps.playerChoice);
		
		comDisplay.setBounds(450,400,230,230);
		comDisplay.setText("COMPUTER CHOSE: " + ps.computerTurn());
		_result.setBounds(225,485,230,50);
		_result.setText(ps.toString());
	}
}
	