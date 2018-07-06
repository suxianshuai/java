package Thread;

import java.util.concurrent.locks.ReentrantLock;

public class AccountLock {
	//����������
	private final ReentrantLock lock = new ReentrantLock();
	//��װ�˻���š��˻�����������Ա����
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
    	//����
    	lock.lock();
    	try
    	{
    		//�˻�������ȡǮ��Ŀ
    		if(balance>=drawAmount)
    		{
    			//�³���Ʊ
    			System.out.println(Thread.currentThread().getName()+"ȡǮ�ɹ����³���Ʊ"+drawAmount);
    			try {
    				Thread.sleep(1);
    			}
    			catch(InterruptedException ex)
    			{
    				ex.printStackTrace();
    			}
    			balance-=drawAmount;
    			System.out.println("���Ϊ��"+ balance);
    		}
    		else
    		{
    			System.out.println(Thread.currentThread().getName()+"����");
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
