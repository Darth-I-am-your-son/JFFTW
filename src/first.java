import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class first {
	
	static myClass ayy = new myClass();
	
	//declares JFrame/Panel/Buttons
	static JFrame g;
	static JFrame f;
	static JPanel p;
	static JPanel q;
	static JButton b;
	static JButton b1;
	static JButton c;
	static JButton c1;
	
	public first() {
		
		gui();
		
	}
	
	public static void gui() {
		 
		//sets JFrame(g) parameters
		g = new JFrame("Lmao, Ayy");
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setSize(450, 800);
		g.setVisible(true);
		g.setResizable(false);
		
		//sets JFrame(f) parameters
		f = new JFrame("Ayy Lmao");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800, 450);
		f.setVisible(true);
		f.setResizable(false);
		
		//makes the second JPanel
		q = new JPanel();
		q.setBackground(Color.BLUE);
		
		//defines JPanel
		p = new JPanel();
		p.setBackground(Color.BLUE);
		
		//defines JButtons
		b = new JButton("I'm a person");	
		b1 = new JButton("I'm a robot");
		c = new JButton("I'm a person");	
		c1 = new JButton("I'm a robot");
		
		//throws it together into the frame
		q.add(c);
		q.add(c1);
		
		p.add(b1);
		p.add(b);
		
		g.add(q);
		
		f.add(p);
		
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "me 2, m8");
				ayy.lmao();
			}
			
		});
		
		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "ewwy, ewwy, wetware = narly");
				
			}	
			
		});
		
	c1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "me 2, m8");
				ayy.lmao();
			}
			
		});
	
		c.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "ewwy, ewwy, wetware = narly");
				
			}	
			
		});
	}
	
	public static void main(String [] args) {
		gui();
	}
	
}