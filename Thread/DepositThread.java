package Thread;

public class DepositThread extends Thread{
	//ģ���˻�
	private Acountwait account;
	//��ǰ����߳���ϣ���Ĵ���߳�
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
