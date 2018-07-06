package Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountCondition {
	//显式定义Lock对象
	private final Lock lock = new ReentrantLock();
	private final Condition cond = lock.newCondition();
	//获得Lock对象对应的Condition
	//封装accountNo，balance两个成员变量
	private String accountNo;
	private double balance;
	//标志账户中是否有存款的标志
	private boolean flag = false;
	public AccountCondition(){}
	public AccountCondition(String accountNo,double balance )
	{
		this.accountNo=accountNo;
		this.balance = balance;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public void draw(double drawAmount)
	{
		lock.lock();
		try
		{
			if(!flag)
				cond.await();
			else
			{
				//执行取钱操作
				System.out.println(Thread.currentThread().getName()+"取钱多少"+drawAmount);
				balance-=drawAmount;
				System.out.println("余额多少"+balance);
				flag=false;
				cond.signal();
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		finally
		{
			lock.unlock();
		}
	}
	public void deposit(double depositAmount)
	{
		lock.lock();
		try {
			if(flag)
			{
				cond.await();
			}
			else
			{
				System.out.println(Thread.currentThread().getName()+"存款多少:"+depositAmount);
				balance+=depositAmount;
				System.out.println("余额多少"+balance);
				flag =true;
				cond.signalAll();
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		finally
		{
			lock.unlock();
		}
	}

}
