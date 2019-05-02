package edu.sjsu.swengg.lab1;

public class GumballMachineAnyCoin extends GumballMachine{
	private int total_amount;

	public GumballMachineAnyCoin(int size) {
		super(size);
		// TODO Auto-generated constructor stub
		total_amount = 0;
	}

	public void insertQuarter(int coin) {
		total_amount+= coin;		
	}

	public void turnCrank() {
		if(total_amount >= 50) {
			if (this.num_gumballs > 0) {
				this.num_gumballs--;
				this.total_amount-= 50;
				System.out.println("Thanks for your money .  Gumball Ejected!");
				if(this.total_amount>0) {
					System.out.println("Please collect your change - " + total_amount + " cents");
					this.total_amount = 0;
				}
			} else
			{
				System.out.println("No More Gumballs!  Sorry, can't return your money.") ;
			}
		}
		else 
		{
			System.out.println( "Please insert sufficient money." ) ;
		}        
	}
}
