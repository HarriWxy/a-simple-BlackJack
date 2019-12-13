package src;


import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Play_with_gui {
	Hand Player;
	Hand Deaker;
	Deck deck;
	public Play_with_gui() {
		// TODO Auto-generated constructor stub
		Player=new Hand();
		Deaker=new Hand();
		deck=new Deck();
		playgame();
	}
	public void playgame() {
		for (int i = 0; i < 2; i++) {
			Player.addcard(deck.withdraw());
		}
		for (int i = 0; i < 2; i++) {
			Deaker.addcard(deck.withdraw());
		}
		if ((Deaker.count()>0) & (Deaker.count()<17)){
			Deaker.addcard(deck.withdraw());
		}
		
	}
	public void player_add() {
		Player.addcard(deck.withdraw());
	}
	public void judge() {
		int player=Player.count(),deaker=Deaker.count();
		if (player==deaker) {
			JOptionPane.showMessageDialog(null, "Æ½¾Ö£¡");
		}
		else{
			if (player==-1) JOptionPane.showMessageDialog(null, "ÄãÓ®ÁË£¡");
			else if (deaker==-1 | (player>21)) {
				JOptionPane.showMessageDialog(null, "ÄãÊäÁË£¡");
			}
			else if ((player>deaker)|(deaker>21)){
				JOptionPane.showMessageDialog(null, "ÄãÓ®ÁË£¡");
			}
			else if ((player<deaker)) {
				JOptionPane.showMessageDialog(null, "ÄãÊäÁË£¡");
			}
		}
	}
	public ArrayList<Card> getPlayer() {
		return Player.getCarray();
	}
	public ArrayList<Card> getDeaker() {
		return Deaker.getCarray();
	}
}
