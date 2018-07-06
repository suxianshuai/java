package test;

import java.util.Scanner;

public class Booth extends Thread{
	
		private static int threadID = 0;
	private Reservoir release;
	private int count = 0;
	public Booth(Reservoir r)
	{
		super("ID:"+ (++threadID));
		this.release=r;
		this.start();
		
	}
	public void run()
	{
		while(true)
		{
			if(this.release.sellTicket())
			{
				this.count+=1;
				System.out.println(this.getName()+":sell 1 tick");
				try {
					sleep((int)Math.random()*100);
					
				}
				catch (InterruptedException e)
				{
					throw new RuntimeException(e);
				}
				
			}
			else 
			{
				break;
			}
				}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("");
		int m = sc.nextInt();
	    Reservoir r = new Reservoir(m);
		Booth b1 = new Booth(r);
		Booth b2 = new Booth(r);
		Booth b3 = new Booth(r);
		

	}

	
	

}
