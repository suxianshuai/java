package Thread;

public class DrawThread  extends Thread{
	private Acountwait account;
	private double drawAmount;
	public DrawThread(String name,Acountwait account,double drawAmount)
	{
    super(name);
    this.account = account;
    this.drawAmount = drawAmount;
    
	}
	public void run()
	{
		/*//使用account作为同步监视器任何线程进入下面同步代码之前
		//必须先获得对account账户的锁定-其他线程无法获得锁，也无法修改他
		//这种做法符合加锁，修改，释放锁的逻辑
		synchronized(account)
		{
		if(account.getBalance()>=drawAmount)
		{
			System.out.println(getName()+"取钱成功！吐出钞票："+drawAmount);
			try
			{
				Thread.sleep(1);
				
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			account.setBalance(account.getBalance()-drawAmount);
			System.out.println("\t余额为："+account.getBalance());
		}
		else
		{
			System.out.println(getName()+"取钱失败！余额不足！");
		}
		}
		
*/
		for(int i=0;i<100;i++)
		{
		account.draw(drawAmount);
		}
	}
	
}
