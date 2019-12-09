package src;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MainFrame extends BasicFrame {
	boolean flag=false;
	Play_with_gui game;
	public MainFrame() {
		// TODO Auto-generated constructor stub
		super();
		game=new Play_with_gui();
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		if (!flag) {
			g.drawString("Robot's cards: * pts", 10, 45);
			
		}
		
		
	}
	public void listener() {
		hit_but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (!flag) {
					game.player_add();
					flag=true;
					repaint();
					game.judge();
				}
			}
		});
		stand_but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (!flag) {
					flag=true;
					repaint();
					game.judge();
				}
			}
		});
		new_but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				flag=false;
				game=new Play_with_gui();
				repaint();
			}
		});
	}
	public static void main(String[] args) {
		new MainFrame();
	}
}
