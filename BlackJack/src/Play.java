package src;

import java.util.Scanner;

public class Play {
	Hand Player;
	Hand Deaker;
	Deck deck;
	Scanner input = new Scanner	(System.in);
	public Play() {
		// TODO Auto-generated constructor stub
		Player=new Hand();
		Deaker=new Hand();
		deck=new Deck();
	}
	public void playgame() {
		for (int i = 0; i < 2; i++) {
			Player.addcard(deck.withdraw());
		}
		Player.showthecard();
		System.out.println("����Ҫ����y/n");
		String t=input.next();
		if (t=="y") {
			Player.addcard(deck.withdraw());
			Player.showthecard();
		}
		for (int i = 0; i < 2; i++) {
			Deaker.addcard(deck.withdraw());
		}
		System.out.print("**");
		if ((Deaker.count()>0) & (Deaker.count()<17)){
			Deaker.addcard(deck.withdraw());
			System.out.println("*");
		}
		
	}
	public void judge(int player, int deaker) {
		if (player==deaker) {
			System.out.println("ƽ��");
			Deaker.showthecard();
		}
		else{
			if (player==-1) System.out.println("��Ӯ��");
			else if (deaker==-1 | (player>21) | (player<deaker)) {
				System.out.println("������");
				Deaker.showthecard();
			}
			else if ((player>deaker)|(deaker>21)){
				System.out.println("��Ӯ��");
				Deaker.showthecard();
			}
		}
	}
}
