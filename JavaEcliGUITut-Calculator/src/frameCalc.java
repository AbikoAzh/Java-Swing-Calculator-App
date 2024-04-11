import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frameCalc {

	private JFrame frame;
	private JTextField textfNum1;
	private JTextField textfNum2;
	private JTextField textfR;
	private int num1,num2,res;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameCalc window = new frameCalc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frameCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 579, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Simple Calcilator By Abubaker Azhari");
		frame.getContentPane().setLayout(null);
		
		textfNum1 = new JTextField();
		textfNum1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textfNum1.setBounds(45, 96, 205, 36);
		frame.getContentPane().add(textfNum1);
		textfNum1.setColumns(10);
		
		textfNum2 = new JTextField();
		textfNum2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textfNum2.setBounds(289, 96, 203, 36);
		frame.getContentPane().add(textfNum2);
		textfNum2.setColumns(10);
		
		JButton btn1 = new JButton("ADD");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1=Integer.parseInt(textfNum1.getText());
					num2=Integer.parseInt(textfNum2.getText());
					res = num1 + num2;
					textfR.setText(Integer.toString(res));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Please Enter Vaild Number");
					textfNum1.setText("");
					textfNum2.setText("");
				}
			}
		});
		btn1.setBounds(138, 179, 132, 36);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("Minus");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1=Integer.parseInt(textfNum1.getText());
					num2=Integer.parseInt(textfNum2.getText());
					res = num1 - num2;
					textfR.setText(Integer.toString(res));
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Please Enter Vaild Number");
					textfNum1.setText("");
					textfNum2.setText("");
				}
			}
		});
		btn2.setBounds(345, 179, 147, 36);
		frame.getContentPane().add(btn2);
		
		textfR = new JTextField();
		textfR.setFont(new Font("Tahoma", Font.BOLD, 17));
		textfR.setBounds(134, 247, 358, 36);
		frame.getContentPane().add(textfR);
		textfR.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Answer is:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(45, 251, 79, 25);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfNum1.setText("");
				textfNum2.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(234, 304, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
