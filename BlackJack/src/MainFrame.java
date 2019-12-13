package src;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class MainFrame extends BasicFrame {
	boolean flag=false;
	Play_with_gui game;
	ImageIcon img_back=new ImageIcon("image/back.gif");
	ImageIcon img_temp;
	ArrayList<Card> player_cards;
	ArrayList<Card> deaker_cards;
	public MainFrame() {
		// TODO Auto-generated constructor stub
		super();
		game=new Play_with_gui();
		getcards();  
		listener();
		setVisible(true);
	}
	public void getcards() {
		player_cards=game.getPlayer();
		deaker_cards=game.getDeaker();
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		if (!flag) {
			g.drawString("Robot's cards: * pts", 10, 45);
			g.drawImage(img_back.getImage(), 10, 55, this);
			for (int i = 1; i < deaker_cards.size(); i++) {
				img_temp=new ImageIcon("image/"+deaker_cards.get(i).toString()+".gif");
				g.drawImage(img_temp.getImage(), 10+i*20, 55, this);
			}
			g.drawString("your cards: "+(game.Player.count()==-1?21:game.Player.count())+" pts", 10, 165);
			for (int i = 0; i < player_cards.size(); i++) {
				img_temp=new ImageIcon("image/"+player_cards.get(i).toString()+".gif");
				g.drawImage(img_temp.getImage(), 10+i*20, 175, this);
			}
		}
		else {
			g.drawString("Robot's cards: "+(game.Deaker.count()==-1?21:game.Deaker.count())+" pts", 10, 45);
			for (int i = 0; i < deaker_cards.size() ; i++) {
				img_temp=new ImageIcon("image/"+deaker_cards.get(i).toString()+".gif");
				g.drawImage(img_temp.getImage(), 10+i*20, 55, this);
			}
			g.drawString("your cards: "+(game.Player.count()==-1?21:game.Player.count())+" pts", 10, 165);
			for (int i = 0; i < player_cards.size(); i++) {
				img_temp=new ImageIcon("image/"+player_cards.get(i).toString()+".gif");
				g.drawImage(img_temp.getImage(), 10+i*20, 175, this);
			}
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
				getcards(); 
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
