package test;

public class Reservoir {
	private int total;
	public Reservoir(int t)
	{
		this.total = t;
	}
	public synchronized boolean sellTicket()
	{
		if (this.total >0)
			{this.total-=1;
		     return true;
		    }
		else 
		{ System.out.println("sell out");
			return false;
		}
		
	     }

}
