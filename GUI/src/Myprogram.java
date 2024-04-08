import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Myprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to my first program");
		CreateUI();
	}
	
	// defined jtextfield
	static JTextField txt1 = new JTextField();
	static JTextField txt2 = new JTextField();
	static JLabel lbl = new JLabel ("the result = ");
	static JLabel lbl2 = new JLabel ("the");
	
	public static void CreateUI(){
		// create instance from class frame
		JFrame myframe = new JFrame ("My First UI");
		// properties : boundaries, width,height
		myframe.setBounds(0, 0, 500, 500);
		// exist from frame when close
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// we need panel to hold button and all other element
		JPanel mypanel = new JPanel ();
		
		mypanel.setLayout(null);
		
		// defined button
		JButton btn1 = new JButton("+");
		// properties for button
		btn1.setSize(100,30);
		btn1.setLocation(30, 30);
		
		JButton btn2 = new JButton("-");
		btn2.setSize(100, 30);
		btn2.setLocation(30, 70);
		
		// property for textfield
		txt1.setSize(100,30);
		txt1.setLocation(30,110);
		txt2.setSize(100,30);
		txt2.setLocation(30,150);
		
		// property for label
		lbl.setSize(100,30);
		lbl.setLocation(30,190);
		
		lbl2.setSize(100,50);
		lbl2.setLocation(50,250);
		lbl2.setText("Tutorial By Abubaker Azhari");
		
		txt1.setText("0");
		txt2.setText("0");
		ActionListener alt = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// convert from string to int
				
				int x = Integer.parseInt(txt1.getText());	
				int y = Integer.parseInt(txt2.getText());
				
				int z = 0;
				//here we use (casting) by convert object
				if(  ((JButton) (arg0.getSource() )).getText() == "+" ) {
					
					z = x+y;
				}
				else if (  ((JButton)(arg0.getSource() )).getText() == "-" ) {
					
					z=x-y;
				}
				lbl.setText(Integer.toString(z));
			}
		};
			
		btn1.addActionListener(alt);
		btn2.addActionListener(alt);
		mypanel.add(btn1);
		mypanel.add(btn2);
		mypanel.add(txt1);
		mypanel.add(txt2);
		mypanel.add(lbl);
		myframe.add(mypanel);
		myframe.setVisible(true);
	}	
}