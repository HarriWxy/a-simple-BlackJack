package src;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class BasicFrame extends JFrame {//基本界面的框架
	Container c;
	JButton hit_but=new JButton("hit");
	JButton stand_but=new JButton("stand");
	JButton new_but=new JButton("new game");
	JPanel butts=new JPanel();
	JPanel center=new JPanel();
	public BasicFrame() {
		// TODO Auto-generated constructor stub
		super("My BlackJack");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 700);
		c=getContentPane();
		c.setLayout(null);
		center.setBackground(new Color(84, 130, 84));
		center.setBounds(0, 0, 500, 620);
		butts.setLayout(new FlowLayout());
		butts.add(hit_but);
		butts.add(stand_but);
		butts.add(new_but);
		butts.setBounds(0,620,500,80);
		c.add(center);
		c.add(butts);
	}
}
