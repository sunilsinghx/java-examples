//swing example with making JFrame object also extending JFrame

import javax.swing.*;

public class Swing_eg extends JFrame	//making Swing_eg child class of JFrame
{
	/*
	public Swing_eg()
	{
	}
	public Swing_eg(String s)
	{
		super(s);	//calling JFrame constuctor for keeping the title
	}
	*/
	public static void main(String[] args)
	{
		JFrame jf = new JFrame("Swing Example");	//using creating JFrame object
		//Swing_eg jf = new Swing_eg("Swing Example");	//using creating Swing_eg object (which is extending JFrame)
		jf.setSize(300,300);
		jf.setVisible(true);	//help to see the container 
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//will close program on clicking on x symbol if not done program will not get closed 
		
		
	}
}