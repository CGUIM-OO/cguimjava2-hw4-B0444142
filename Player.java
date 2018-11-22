import java.util.ArrayList;

public class Player {
	private String name;
	private int chips;
	private int bet;
	private int sum=0;
	private ArrayList<Card> oneRoundCard;
	
	public Player(String name, int chips){
		
	}
	
	public String getName() {
		return name;
	}

	public int makeBet(){
		if (bet>chips||chips==0)
		{
			return bet=0;
		}
		return bet;
	}
	
	public void setOneRoundCard(ArrayList<Card> cards){
		this.oneRoundCard=cards;
	 }
	
	public boolean hitMe() {
		for(int i=0;i<oneRoundCard.size();i++)
		{
			
		}
		
		if(sum<16)
		{
			return true;
		}
		else
			return false;
		
		
	}

	public int getTotalValue(){
		return sum;
	}
	
	
	
	public void increaseChips (int diff){
		this.chips=chips+diff;
	}
	
	public int getCurrentChips() {
		return chips;
	}
	
	public void sayHello(){
		System.out.println("Hello, I am " + name + ".");
	    System.out.println("I have " + chips + " chips.");

	}
	
}
