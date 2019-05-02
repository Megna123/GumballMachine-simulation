package edu.sjsu.swengg.lab1;

public class GumballMachine50Cents extends GumballMachine{
	private int number_quarter_coins;

	public GumballMachine50Cents(int size) {
		super(size);
		this.number_quarter_coins = 0;
	}	

	public void insertQuarter(int coin) {
		if(coin == 25) {
			number_quarter_coins++;
		}
	}

	public void turnCrank() {
		if (this.number_quarter_coins >= 2)
		{
			if (this.num_gumballs > 0)
			{
				this.num_gumballs-- ;
				this.number_quarter_coins -= 2;
				System.out.println( "Thanks for your quarters.  Gumball Ejected!" ) ;
				if(this.number_quarter_coins>0) {
					System.out.println("Please collect your change - " + number_quarter_coins*25 + " cents");
					this.number_quarter_coins = 0;
				}
			}
			else
			{
				System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
			}
		}
		else 
		{
			System.out.println( "Please insert 2 quarters" ) ;
		}        
	}
}
