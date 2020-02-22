import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextPane;
import javax.swing.Timer;

public class Swap implements ActionListener{
	JTextPane el1;
	JTextPane el2;
	public int el1InitialX;
	public int el2InitialX;
	public boolean swapped=false;
	Timer tm = new Timer(30,this);
	public Swap(){
		
	}
	public Swap(JTextPane pp,JTextPane p1){
		this.el1=pp;
		this.el2=p1;
		el1InitialX=pp.getX();
		el2InitialX=p1.getX();
		tm.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(el2.getX() == el1InitialX && el1.getX() == el2InitialX  )
		{
			swapped=true;
			tm.stop();
			System.out.println("Stopped");
		}
		else if(swapped==false)
		{
			el1.setBounds(el1.getX()+1, el1.getY(), el1.getWidth(), el1.getHeight());
			el2.setBounds(el2.getX()-1, el2.getY(), el2.getWidth(), el2.getHeight());
			
		}
//		System.out.println("El1:" + el1.getX());
//		System.out.println("El2:" + el2.getX());

	}
	
}