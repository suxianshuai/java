package Thread;

public class DepositThread extends Thread{
	//模拟账户
	private Acountwait account;
	//当前存款线程所希望的存款线程
	private double depositAmount;
	public  DepositThread(String name,Acountwait account,double depositAmount)
	{
		super(name);
		this.account = account;
		this.depositAmount=depositAmount;
	}
	public void run()
	{
		for (int i=0;i<100;i++)
		{
			account.deposit(depositAmount);
		}
	}

}
