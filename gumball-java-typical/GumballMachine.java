package edu.sjsu.swengg.lab1;

public class GumballMachine
{
	protected int num_gumballs;
	private boolean has_quarter;

	public GumballMachine( int size )
	{
		// initialise instance variables
		this.num_gumballs = size;
		this.has_quarter = false;
	}

	public void insertQuarter(int coin)
	{
		if ( coin == 25 )
			this.has_quarter = true ;
		else 
			this.has_quarter = false ;
	}

	public void turnCrank()
	{
		if ( this.has_quarter )
		{
			if ( this.num_gumballs > 0 )
			{
				this.num_gumballs-- ;
				this.has_quarter = false ;
				System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
			}
			else
			{
				System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
			}
		}
		else 
		{
			System.out.println( "Please insert a quarter" ) ;
		}        
	}
	
	/* Test code to check the functionality of assignment */
	public static void main(String[] args) {
		System.out.println("Gumball Machine 1 :");
		GumballMachine gumballmachine = new GumballMachine(3);
		for (int i = 0; i < 4; i++) {
			gumballmachine.insertQuarter(25);
			gumballmachine.turnCrank();
		}
		System.out.println("Gumball Machine 2 :");
		GumballMachine50Cents gumballmachine50cents= new GumballMachine50Cents(3);
		gumballmachine50cents.insertQuarter(25);
		gumballmachine50cents.insertQuarter(25);
		gumballmachine50cents.insertQuarter(25);	
		gumballmachine50cents.turnCrank();
		System.out.println("Gumball Machine 3 :");
		GumballMachineAnyCoin gumballmachineanycoin = new GumballMachineAnyCoin(3);
		gumballmachineanycoin.insertQuarter(25);
		gumballmachineanycoin.insertQuarter(10);
		gumballmachineanycoin.insertQuarter(10);
		gumballmachineanycoin.insertQuarter(10);
		gumballmachineanycoin.turnCrank();		
	}
}
