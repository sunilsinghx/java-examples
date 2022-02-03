//make gui to add

import javax.swing.*;
import java.awt.event.*;
class Add_swing extends JFrame
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	JButton b1;
	public Add_swing() { }
	public Add_swing(String s){super(s);}	
	
	public void setComponents()
	{
		l1= new JLabel("Addition of two numbers");
		l2 = new JLabel("First no");
		l3= new JLabel("Second no");
		l4 = new JLabel();
		t1 = new JTextField();
		t2= new JTextField();
		b1 = new JButton("Add");
		setLayout(null);	//we setting our layout not default
		l1.setBounds(50,50,200,20);	//50 pix from left 50 from right 200 width 20 height
		l2.setBounds(50,80,100,20);
		t1.setBounds(150,80,100,20);
		l3.setBounds(50,130,100,20);
		t2.setBounds(150,130,100,20);
		b1.setBounds(80,180,100,20);
		l4.setBounds(50,200,200,20);
		b1.addActionListener(new Handler());
		//add to layout
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(b1);
		add(l4);
	}
//listner class
class Handler implements ActionListener
{
	public void actionPerformed(ActionEvent e)	//only method in interface ActionListener
	{	
		int a = Integer.parseInt(t1.getText());	//convert text to integer
		int b = Integer.parseInt(t2.getText());
		int sum = a+b;
		l4.setText("Result is "+sum);	//set reusult to label
	}
}	

	public static void main(String[] arh)
	{
		Add_swing jf = new Add_swing("Add Eg");
		jf.setComponents();	//will set layout
		jf.setSize(300,300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}