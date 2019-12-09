package src;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class MainFrame extends BasicFrame {
	boolean flag=false;
	Play_with_gui game;
	ArrayList<Image> images=new ArrayList<Image>();
	ImageIcon img_temp;
	public MainFrame() {
		// TODO Auto-generated constructor stub
		super();
		game=new Play_with_gui();
		img_temp=new ImageIcon("image/back.gif");
		images.add(img_temp.getImage());
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		if (!flag) {
			g.drawString("Robot's cards: * pts", 10, 45);
			g.drawImage(img_temp.getImage(), 10, 55, this);
			
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
//	public void fileopen() {
//		File temp=new File("image/back.gif");
//		try {
//			Desktop.getDesktop().open(temp);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	public static void main(String[] args) {
		new MainFrame();
	}
}
