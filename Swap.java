import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.Timer;

public class Swap implements ActionListener{
	public static boolean isOkay = true;
	JTextPane el1;
	JTextPane el2;
	private int x=0;
	private int x2=0;
	public int el1InitialX;
	public int el2InitialX;
	Timer tm = new Timer(30,this);
	public Swap(JTextPane pp,JTextPane p1){
		this.el1=pp;
		this.isOkay = false;
		this.el2=p1;
		this.el1.setBackground(Color.green);
		this.el2.setBackground(Color.green);
		el1InitialX=el1.getX();
		el2InitialX=el2.getX();
		tm.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(el2.getX() <= el1InitialX && el1.getX() >= el2InitialX)
		{
			tm.stop();
			this.isOkay = true;
			this.el1.setBackground(Color.magenta);
			this.el2.setBackground(Color.magenta);
			System.out.println("Stopped");
		}
		else
		{
			this.isOkay = false;
			el1.setBounds(el1.getX()+1, el1.getY(), el1.getWidth(), el1.getHeight());
			el2.setBounds(el2.getX()-1, el2.getY(), el2.getWidth(), el2.getHeight());
			this.el1.setBackground(Color.green);
			this.el2.setBackground(Color.green);
		}
//		System.out.println("El1:" + el1.getX());
//		System.out.println("El2:" + el2.getX());

	}
	
}
