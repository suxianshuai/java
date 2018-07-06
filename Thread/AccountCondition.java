package Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountCondition {
	//��ʽ����Lock����
	private final Lock lock = new ReentrantLock();
	private final Condition cond = lock.newCondition();
	//���Lock�����Ӧ��Condition
	//��װaccountNo��balance������Ա����
	private String accountNo;
	private double balance;
	//��־�˻����Ƿ��д��ı�־
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
				//ִ��ȡǮ����
				System.out.println(Thread.currentThread().getName()+"ȡǮ����"+drawAmount);
				balance-=drawAmount;
				System.out.println("������"+balance);
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
				System.out.println(Thread.currentThread().getName()+"������:"+depositAmount);
				balance+=depositAmount;
				System.out.println("������"+balance);
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
