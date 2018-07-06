package composition;

public class Battry {
	private double power=0.0;
	public void chargBattry(double p)
	{
		if (power<1.0)
		{power+=p;}
			
	}
	public boolean useBattery(double p)
	{  
		try 
		  {
			test(p);
		  }
		catch(Exception e)
		{
			System.out.println("catch Exception");
			System.out.println(e.getMessage());
			p = 0.0;
		}
		if(this.power>=p)
		{
			this.power-=p;
			return true;
		}
		else
		{
			this.power = 0.0;
			return false;
			
		}
	
	

} 
	private void test(double p) throws Exception //I just throw,not handle
	{
		// TODO Auto-generated method stub
		
		  
			if(p<0)
			{
				Exception e = new Exception("p must be positive");
				throw e;
			}
		

	}
	public static class Torch{
	private Battry thebattry = new Battry();
	public void turnon(int hours)
	{
		boolean usable;
		usable = this.thebattry.useBattery(hours*0.1);
		if(usable!=true)
			System.out.println("Battry is out!");
	}
		
	public void charge(int hours)
	{
		this.thebattry.chargBattry(hours*0.1);
		
	}
		
	}
	
}
