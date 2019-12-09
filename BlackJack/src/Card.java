package src;

public class Card {
	final public static String[] RANkS = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	final public static String[] SUITS = {"c","d","h","s"};
	int k=0;
	Card(int k){
		this.k=k;
	}
	public String toString() {
		return SUITS[k/13]+RANkS[k%13];
	}
}