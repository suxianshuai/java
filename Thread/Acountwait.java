package Thread;

public class Acountwait {
	//封装账户编号，账户余额的两个成员变量
	private String accountNo;
	private double balance;
	private boolean flag = false;
	public Acountwait() {}
	public Acountwait(String accountNo,double balance)
	{
		this.accountNo=accountNo;
		this.balance = balance;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public synchronized void draw (double drawAccount)
	{
		try
		{   //如果是假，说明账户还没有人存款，取钱方法阻塞
			if(!flag)
			{
				this.wait();
			}
			else
			{
				//执行取钱操作
				System.out.println(Thread.currentThread().getName()+"取钱"+drawAccount);
				balance-=drawAccount;
				System.out.println("账户余额为："+balance);
				//将标志账户是否已有存款的旗标设为false
				flag = false;
				notifyAll();
				
			}
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		
	}
	public synchronized void deposit(double depositAmount)
	{
		try {
			//如果flag为真，表明账户中已有人存钱进去，存钱方法阻塞
			if(flag)
			{
				wait();
			}
			else 
			{
				//执行存款操作
				System.out.println(Thread.currentThread().getName()+"存款："+depositAmount);
				balance+=depositAmount;
				System.out.println("账户余额为"+balance);
				flag = true;
				notifyAll();
			}	
	       }
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
