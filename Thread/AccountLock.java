package Thread;

import java.util.concurrent.locks.ReentrantLock;

public class AccountLock {
	//定义锁对象
	private final ReentrantLock lock = new ReentrantLock();
	//封装账户编号、账户余额的两个成员变量
	private String accountNo;
	private double balance;
	public AccountLock() {}
	public AccountLock(String accountNo,double balance)
	{
	this.accountNo=accountNo;
	this.balance =balance;
	
	}
	public double getBanlance()
	{
		return this.balance;
	}
    public void draw (double drawAmount)
    {
    	//加锁
    	lock.lock();
    	try
    	{
    		//账户余额大于取钱数目
    		if(balance>=drawAmount)
    		{
    			//吐出钞票
    			System.out.println(Thread.currentThread().getName()+"取钱成功！吐出钞票"+drawAmount);
    			try {
    				Thread.sleep(1);
    			}
    			catch(InterruptedException ex)
    			{
    				ex.printStackTrace();
    			}
    			balance-=drawAmount;
    			System.out.println("余额为："+ balance);
    		}
    		else
    		{
    			System.out.println(Thread.currentThread().getName()+"余额不足");
    		}
    	}
    	finally
    	{
    		lock.unlock();
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
