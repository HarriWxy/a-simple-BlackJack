package src;

public class Card {
	final public static String[] RANKS = {"a","2","3","4","5","6","7","8","9","10","j","q","k"};
	final public static String[] SUITS = {"c","d","h","s"};
	int k=0;
	Card(int k){
		this.k=k;
	}
	public String toString() {
		return RANKS[k%13]+SUITS[k/13];
	}
}