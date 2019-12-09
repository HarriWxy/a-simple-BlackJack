package src;
import java.util.Stack;
public class Deck {
//	Card[]cards=new Card[52];
	private Stack<Card>cards;
	public Deck(){
//		boolean[]temp=new boolean[52];
//		for (int i = 0; i < 52;) {
//			int r=(int)(52*Math.random());
//			if (temp[r]==false) {
//				cards.push(new Card(r));
//				i++;
//				temp[r]=true;
//			}
//		}
		wash();
	}
	public void clear() {
		cards=new Stack<>();
	}
	public void wash() {
		clear();
		boolean[]temp=new boolean[52];
		for (int i = 0; i < 52;) {
			int r=(int)(52*Math.random());
			if (temp[r]==false) {
				cards.push(new Card(r));
				i++;
				temp[r]=true;
			}
		}
	}
	public Card withdraw(){
		Card c=cards.pop();
		return c;
	}

}
