package src;

public class testcard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hand h1=new Hand();
		Hand h2=new Hand();
		Deck d=new Deck();
		h1.addcard(d.withdraw());
		h2.addcard(d.withdraw());
		h1.addcard(d.withdraw());
		h2.addcard(d.withdraw());
		h1.addcard(d.withdraw());
		h2.addcard(d.withdraw());
		h1.showthecard();
		h2.showthecard();
		h1.give(h1.withdraw(), h2);
		h1.showthecard();
		h2.showthecard();
		
	}

}
