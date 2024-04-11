package calculate;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

public class Comp extends JFrame {
	
	public JButton btn0 = new JButton();
	public JButton btn1 = new JButton();
	public JButton btn2 = new JButton();
	public JButton btn3 = new JButton();
	public JButton btn4 = new JButton();
	public JButton btn5 = new JButton();
	public JButton btn6 = new JButton();
	public JButton btn7 = new JButton();
	public JButton btn8 = new JButton();
	public JButton btn9 = new JButton();
	public JButton sum = new JButton();
	public JButton min = new JButton();
	public JButton div = new JButton();
	public JButton mul = new JButton();
	public JButton equ = new JButton();
	public JButton poi = new JButton();
	public JButton per = new JButton();
	public JTextField txt = new JTextField();
	public JTextField txtr = new JTextField();
	public JButton cirl = new JButton();
	public JButton cirr = new JButton();
	public JButton ce = new JButton();
	public JButton c = new JButton();
	public JLabel abu = new JLabel();

	Main main = new Main();
	
	int hold;  // this to hold int number in previous
	int array[] = new int[20];  // array to save previous number
	String sign;    // to dertermine the math process
	String num1;     // this to save text in jtextfield to convert it to int
	String num2;     // this to save text in jtextfield to convert it to int
	String p;       // used to chek if the jtextfiled empty or not
	int count = 0;   // counter to count the number to return it
	int n1;           // to hold number in num1
	int n2;           // to hold number in num2
	int r;     // result
	
	boolean point = false;    // to determine which array will save the previous number 
	double holdd;
	double arrayd[] = new double[20];
	double nd1;
	double nd2;
	double rd;
	DecimalFormat df=new DecimalFormat("0.##");    // format and rounding and also for chek if the number is integer
	boolean pointchk = false;   // to prevent addding more than one pointer
	boolean back = false;    // this for prevent previous number from fire if the process in =
	
	
	
	public Comp(){
		initcomponent();
	}
	
	public void initcomponent(){
		
		setTitle("Calculator");
		setResizable(false);
		
		Container container = getContentPane();
		container.setBackground(new Color(230,235,230));
		
		txt.setFont(new Font("Times New Roman",Font.BOLD, 33));
		txt.setEditable(false);
		txt.setBackground(new Color(240,245,240));
		txt.setHorizontalAlignment(JTextField.RIGHT);
		
		
		txtr.setFont(new Font("Times New Roman",Font.BOLD,20));
		txtr.setEditable(false);
		txtr.setBackground(new Color(240,245,240));
		txtr.setHorizontalAlignment(JTextField.RIGHT);
		
		abu.setText("Developed And Designed By Abubaker Azhari");
		abu.setForeground(new Color(90,2,64));
		abu.setHorizontalAlignment(JLabel.CENTER);
		abu.setFont(new Font("Times New Roman",Font.BOLD,15));
		
		btn0.setText("0");
		btn0.setFont(new Font("Times New Roman",Font.BOLD, 25) );
		btn0.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickb0(e);
			}
		});
		
		btn1.setText("1");
		btn1.setFont(new Font("Times New Roman",Font.BOLD, 25) );
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickb1(e);
			}
		});
		
		btn2.setText("2");
		btn2.setFont(new Font("Times New Roman",Font.BOLD, 25) );
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickb2(e);
			}
		});
		
		btn3.setText("3");
		btn3.setFont(new Font("Times New Roman",Font.BOLD, 25) );
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickb3(e);
			}
		});
		
		btn4.setText("4");
		btn4.setFont(new Font("Times New Roman",Font.BOLD, 25) );
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickb4(e);
			}
		});
		
		btn5.setText("5");
		btn5.setFont(new Font("Times New Roman",Font.BOLD, 25) );
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickb5(e);
			}
		});
		
		btn6.setText("6");
		btn6.setFont(new Font("Times New Roman",Font.BOLD, 25) );
		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickb6(e);
			}
		});
		
		btn7.setText("7");
		btn7.setFont(new Font("Times New Roman",Font.BOLD, 25) );
		btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickb7(e);
			}
		});
		
		btn8.setText("8");
		btn8.setFont(new Font("Times New Roman",Font.BOLD, 25) );
		btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickb8(e);
			}
		});
		
		btn9.setText("9");
		btn9.setFont(new Font("Times New Roman",Font.BOLD, 25) );
		btn9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickb9(e);
			}
		});
		
		div.setText("/");
		div.setFont(new Font("Times New Roman",Font.BOLD, 25) );
		div.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickdiv(e);
			}
		});
		
		mul.setText("x");
		mul.setFont(new Font("Arial",Font.CENTER_BASELINE, 20) );
		mul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickmul(e);
			}
		});
		
		min.setText("-");
		min.setFont(new Font("Times New Roman",Font.BOLD, 25) );
		min.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickmin(e);
			}
		});
		
		sum.setText("+");
		sum.setFont(new Font("Times New Roman",Font.BOLD, 25) );
		sum.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clicksum(e);
			}
		});
		
		poi.setText(".");
		poi.setFont(new Font("Times New Roman",Font.BOLD, 25) );
		poi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickpoi(e);
			}
		});
		
		equ.setText("=");
		equ.setFont(new Font("Times New Roman",Font.BOLD, 25) );
		equ.setBackground(new Color(0,150,250));
		equ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickequ(e);
			}
		});
		
		cirl.setText("(");
		cirl.setFont(new Font("Times New Roman",Font.BOLD, 20));
		cirl.setBackground(new Color(150,170,160));
		cirl.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickcirl(e);
			}
		});
		
		cirr.setText(")");
		cirr.setFont(new Font("Times New Roman",Font.BOLD, 20));
		cirr.setBackground(new Color(150,170,160));
		cirr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickcirr(e);
			}
		});
		
		ce.setText("CE");
		ce.setFont(new Font("Times New Roman",Font.BOLD, 20));
		ce.setBackground(new Color(150,170,160));
		ce.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickce(e);
			}
		});
		
		c.setText("C");
		c.setFont(new Font("Times New Roman",Font.BOLD, 20));
		c.setBackground(new Color(150,170,160));
		c.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickc(e);
			}
		});
		
		GroupLayout glayout = new GroupLayout(container);
		container.setLayout(glayout);
		
		glayout.setHorizontalGroup(glayout.createSequentialGroup()
				.addContainerGap(15,Short.MAX_VALUE)
				.addGroup(glayout.createParallelGroup()
						.addGroup(glayout.createSequentialGroup()
								.addComponent(txtr,GroupLayout.PREFERRED_SIZE,420,GroupLayout.PREFERRED_SIZE))
						.addGroup(glayout.createSequentialGroup()
								.addComponent(txt,GroupLayout.PREFERRED_SIZE,420,GroupLayout.PREFERRED_SIZE))
						.addGroup(glayout.createParallelGroup()
								.addGroup(glayout.createSequentialGroup()
										.addComponent(cirl,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cirr,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(ce,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(c,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE))
								.addGroup(glayout.createSequentialGroup()
										.addComponent(btn7,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(btn8,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(btn9,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(div,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE))
								.addGroup(glayout.createSequentialGroup()
										.addComponent(btn4,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(btn5,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(btn6,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(mul,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE))
								.addGroup(glayout.createSequentialGroup()
										.addComponent(btn1,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(btn2,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(btn3,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(min,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE))
								.addGroup(glayout.createSequentialGroup()
										.addComponent(btn0,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(poi,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(equ,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(sum,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)))
						.addComponent(abu, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(15,Short.MAX_VALUE));
		
		glayout.setVerticalGroup(glayout.createSequentialGroup()
				.addContainerGap(40,Short.MAX_VALUE)
				.addGroup(glayout.createSequentialGroup()
						.addGroup(glayout.createSequentialGroup()
								.addComponent(txtr,GroupLayout.PREFERRED_SIZE,30,GroupLayout.PREFERRED_SIZE)
								.addComponent(txt,GroupLayout.PREFERRED_SIZE,50,GroupLayout.PREFERRED_SIZE)
								.addContainerGap(20,Short.MAX_VALUE))
						.addGroup(glayout.createSequentialGroup()
								.addGroup(glayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(cirl,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
										.addComponent(cirr,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
										.addComponent(ce,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
										.addComponent(c,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(glayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(btn7,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
										.addComponent(btn8,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
										.addComponent(btn9,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
										.addComponent(div,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(glayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(btn4,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
										.addComponent(btn5,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
										.addComponent(btn6,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
										.addComponent(mul,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(glayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(btn1,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
										.addComponent(btn2,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
										.addComponent(btn3,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
										.addComponent(min,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(glayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(btn0,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
										.addComponent(poi,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
										.addComponent(equ,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
										.addComponent(sum,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(15,Short.MAX_VALUE)
						.addComponent(abu, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(10,Short.MAX_VALUE));
		pack();
		setLocationRelativeTo(getOwner());
	}
	
	
	private void clickb0(ActionEvent e){
		back = false;
		p = txt.getText();
		if(p.isEmpty()){
			txt.setText("0");
			hold = 0;
			array[count] = hold;
		}else{
			txt.setText(p+"0");
			if(point == true){
				holdd = Double.parseDouble(p);
				count = count+1;
				arrayd[count] = holdd;
				array[count]=0;
			}else{
				hold = Integer.parseInt(p) ;
				count = count+1;
				array[count]= hold;
				arrayd[count] = 0;
			}
		}
	}
	private void clickb1(ActionEvent e){
		back = false;
		p = txt.getText();
		if(p.isEmpty()){
			txt.setText("1");
			hold = 1;
			array[count] = hold;
		}else{
			txt.setText(p+"1");
			if(point == true){
				holdd = Double.parseDouble(p);
				count = count+1;
				arrayd[count] = holdd;
				array[count]=0;
			}else{
				hold = Integer.parseInt(p);
				count = count+1;
				array[count] = hold;
				arrayd[count] = 0;
			}
	
		}	
	}
	
	private void clickb2(ActionEvent e){
		back = false;
		p = txt.getText();
		if(p.isEmpty()){
			txt.setText("2");
			hold = 2;
			array[count] = hold;
		}else{
			txt.setText(p+"2");
			if(point == true){
				holdd = Double.parseDouble(p);
				count = count+1;
				arrayd[count] = holdd;
				array[count]=0;
			}else{
				hold = Integer.parseInt(p);
				count = count+1;
				array[count] = hold;
				arrayd[count] = 0;
			}
		}
	}
	
	private void clickb3(ActionEvent e){
		back = false;
		p = txt.getText();
		if(p.isEmpty()){
			txt.setText("3");
			hold = 3;
			array[count] = hold;
		}else{
			txt.setText(p+"3");
			if(point == true){
				holdd = Double.parseDouble(p);
				count = count+1;
				arrayd[count] = holdd;
				array[count]=0;
			}else{
				hold = Integer.parseInt(p);
				count = count+1;
				array[count] = hold;
				arrayd[count] = 0;
			}
		}
	}
	private void clickb4(ActionEvent e){
		back = false;
		p = txt.getText();
		if(p.isEmpty()){
			txt.setText("4");
			hold = 4;
			array[count] = hold;
		}else{
			txt.setText(p+"4");
			if(point == true){
				holdd = Double.parseDouble(p);
				count = count+1;
				arrayd[count] = holdd;
				array[count]=0;
			}else{
				hold = Integer.parseInt(p);
				count = count+1;
				array[count] = hold;
				arrayd[count] = 0;
			}
		}
	}
	private void clickb5(ActionEvent e){
		back = false;
		p = txt.getText();
		if(p.isEmpty()){
			txt.setText("5");
			hold = 5;
			array[count] = hold;
		}else{
			txt.setText(p+"5");
			if(point == true){
				holdd = Double.parseDouble(p);
				count = count+1;
				arrayd[count] = holdd;
				array[count]=0;
			}else{
				hold = Integer.parseInt(p);
				count = count+1;
				array[count] = hold;
				arrayd[count] = 0;
			}
	
		}
	}
	private void clickb6(ActionEvent e){
		back = false;
		p = txt.getText();
		if(p.isEmpty()){
			txt.setText("6");
			hold = 6;
			array[count] = hold;
		}else{
			txt.setText(p+"6");
			if(point == true){
				holdd = Double.parseDouble(p);
				count = count+1;
				arrayd[count] = holdd;
				array[count]=0;
			}else{
				hold = Integer.parseInt(p);
				count = count+1;
				array[count] = hold;
				arrayd[count] = 0;
			}

		}
	}
	private void clickb7(ActionEvent e){
		back = false;
		p = txt.getText();
		if(p.isEmpty()){
			txt.setText("7");
			hold = 7;
			array[count] = hold;
		}else{
			txt.setText(p+"7");
			if(point == true){
				holdd = Double.parseDouble(p);
				count = count+1;
				arrayd[count] = holdd;
				array[count]=0;
			}else{
				hold = Integer.parseInt(p);
				count = count+1;
				array[count] = hold;
				arrayd[count] = 0;
				}

		}
	}
	private void clickb8(ActionEvent e){
		back = false;
		p = txt.getText();
		if(p.isEmpty()){
			txt.setText("8");
			hold = 8;
			array[count] = hold;
		}else{
			txt.setText(p+"8");
			if(point == true){
				holdd = Double.parseDouble(p);
				count = count+1;
				arrayd[count] = holdd;
				array[count]=0;
			}else{
				hold = Integer.parseInt(p);
				count = count+1;
				array[count] = hold;
				arrayd[count] = 0;
			}

		}
	}
	private void clickb9(ActionEvent e){
		back = false;
		p = txt.getText();
		if(p.isEmpty()){
			txt.setText("9");
			hold = 9;
			array[count] = hold;
		}else{
			txt.setText(p+"9");
			if(point == true){
				holdd = Double.parseDouble(p);
				count = count+1;
				arrayd[count] = holdd;
				array[count]=0;
			}else{
				hold = Integer.parseInt(p);
				count = count+1;
				array[count] = hold;
				arrayd[count] = 0;
			}

		}
	}
	private void clickpoi(ActionEvent e){
		back = false;
		if(pointchk == false){
			point = true;
			p = txt.getText();
			
			if(p.isEmpty()){
				txt.setText("0.");
				holdd = 0.0;
				arrayd[count] = holdd;
			}else{
				txt.setText(p+".");
				holdd = Double.parseDouble(p);
				count = count+1;
				arrayd[count] = holdd;
			}
			pointchk = true;
		}
	}
	
	private void clickequ(ActionEvent e){
		pointchk = false;
		back = true;
        if(txt.getText().length()!=0){
        	String txtn = txt.getText();
 
        	if(txtr.getText().length()!=0){
        		String txtrn = txtn;
        		
        		if(sign == ("+")){
        			
        			if(point == false){
        				num2=txt.getText();
        				n2 =Integer.parseInt(num2);
        				r= n1 + n2;
        				txtr.setText(txtr.getText()+txt.getText());
        				String nn = Integer.toString(r);
        				txt.setText(nn);
        			}else{
        				num2=txt.getText();
        				nd2 =Double.parseDouble(num2);
        				rd= nd1 + nd2;
        				txtr.setText(txtr.getText()+txt.getText());
        				String nn = Double.toString(rd);
        				
        				if(rd % 1 == 0){
        					txt.setText(df.format(rd));
        					point = false;
        				}else{
        					txt.setText(df.format(rd));
        				}
        				
        			}
    			}
    			
    			if(sign == ("-")){
    				
    				if(point == false){
    		
	    				num2=txt.getText();
	    				n2 =Integer.parseInt(num2);
	    				r= n1 - n2;
	    			    txtr.setText(txtr.getText()+txt.getText());
	    				String nn = Integer.toString(r);
	    				txt.setText(nn);
    				}else{
    					
        				num2=txt.getText();
        				nd2 =Double.parseDouble(num2);
        				rd= nd1 - nd2;
        				txtr.setText(txtr.getText()+txt.getText());
        				String nn = Double.toString(rd);
        				
        				if(rd % 1 == 0){
        					txt.setText(df.format(rd));
        					point = false;
        				}else{
        					txt.setText(df.format(rd));
        				}
        				
        			}
    			}
    			
    			if(sign == ("x")){
    				
    				if(point == false){
	    				num2=txt.getText();
	    				n2 =Integer.parseInt(num2);
	    				r= n1 * n2;
	    			    txtr.setText(txtr.getText()+txt.getText());
	    				String nn = Integer.toString(r);
	    				txt.setText(nn);
    				}else{
    					num2=txt.getText();
        				nd2 =Double.parseDouble(num2);
        				rd= nd1 * nd2;
        				txtr.setText(txtr.getText()+txt.getText());
        				String nn = Double.toString(rd);
        				
        				if(rd % 1 == 0){
        					txt.setText(df.format(rd));
        					point = false;
        				}else{
        					txt.setText(df.format(rd));
        				}
        				
        			}
    				
    			}
    			
    			if(sign == ("/")){
    				
    				if(point == false){
	    				num2=txt.getText();
	    				n2 =Integer.parseInt(num2);
	    				r= n1 / n2;
	    			    txtr.setText(txtr.getText()+txt.getText());
	    				String nn = Integer.toString(r);
	    				txt.setText(nn);
    				}else{
    					num2=txt.getText();
        				nd2 =Double.parseDouble(num2);
        				rd= nd1 / nd2;
        				txtr.setText(txtr.getText()+txt.getText());
        				String nn = Double.toString(rd);
        				
        				if(rd % 1 == 0){
        					txt.setText(df.format(rd));
        					point = false;
        				}else{
        					txt.setText(df.format(rd));
        				}
        			}
    			}
        	}
        }else if(txtr.getText().length()!=0){
        	txt.setText(num1);
        }
	}
	
	private void clicksum(ActionEvent e){
		pointchk = false;
		back = false;
		if(point == false){
			num1=txt.getText();
			n1 = Integer.parseInt(num1);
			nd1 = Double.parseDouble(num1); 
			txtr.setText(txt.getText()+" + ");
			txt.setText("");
	        sign = ("+");
		}else{
			num1=txt.getText();
			nd1 = Double.parseDouble(num1);
			txtr.setText(txt.getText()+" + ");
			txt.setText("");
	        sign = ("+");
		}
	}
	
	private void clickmin(ActionEvent e){
		pointchk = false;
		back = false;
		if(point == false){
			num1=txt.getText();
			n1 = Integer.parseInt(num1);
			nd1 = Double.parseDouble(num1);
			txtr.setText(txt.getText()+" - ");
			txt.setText("");
	        sign = ("-");
		}else{
			num1=txt.getText();
			nd1 = Double.parseDouble(num1);
			txtr.setText(txt.getText()+" - ");
			txt.setText("");
	        sign = ("-");
		}
	}
	private void clickmul(ActionEvent e){
		pointchk = false;
		back = false;
		if(point == false){
			num1=txt.getText();
			n1 = Integer.parseInt(num1);
			nd1 = Double.parseDouble(num1);
			txtr.setText(txt.getText()+" x ");
			txt.setText("");
	        sign = ("x");
		}else{
			num1=txt.getText();
			nd1 = Double.parseDouble(num1);
			txtr.setText(txt.getText()+" x ");
			txt.setText("");
	        sign = ("x");
	        
		}
	}
	private void clickdiv(ActionEvent e){
		pointchk = false;
		back = false;
		if(point == false){
			num1=txt.getText();
			n1 = Integer.parseInt(num1);
			nd1 = Double.parseDouble(num1);
			txtr.setText(txt.getText()+" / ");
			txt.setText("");
	        sign = ("/");
	    }else{
			num1=txt.getText();
			nd1 = Double.parseDouble(num1);
			txtr.setText(txt.getText()+" / ");
			txt.setText("");
	        sign = ("/");
	        
        }
	}
	private void clickc(ActionEvent e){
		pointchk = false;
		txt.setText("");
		txtr.setText("");
	}
	private void clickce(ActionEvent e){
		pointchk = false;
			
			p = txt.getText();
			if(p.isEmpty() || count == 0){
				txt.setText("");
			}else{
				if(point == false){
					if(back == false){
						String s = Integer.toString(array[count]);
						txt.setText(s);
					}else{txt.setText("0");}
				}else{
					if(back == false){
					String s = Double.toString(arrayd[count]);
					txt.setText(s);
					}else{txt.setText("0");}
				}
				
				if(count > 0){
					count=count-1;
				}
			}
		
	}
	private void clickcirr(ActionEvent e){
		
	}
	private void clickcirl(ActionEvent e){
		
	}
	
	
}
