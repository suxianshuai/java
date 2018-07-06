package Thread;

public class Acountwait {
	//��װ�˻���ţ��˻�����������Ա����
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
		{   //����Ǽ٣�˵���˻���û���˴�ȡǮ��������
			if(!flag)
			{
				this.wait();
			}
			else
			{
				//ִ��ȡǮ����
				System.out.println(Thread.currentThread().getName()+"ȡǮ"+drawAccount);
				balance-=drawAccount;
				System.out.println("�˻����Ϊ��"+balance);
				//����־�˻��Ƿ����д��������Ϊfalse
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
			//���flagΪ�棬�����˻��������˴�Ǯ��ȥ����Ǯ��������
			if(flag)
			{
				wait();
			}
			else 
			{
				//ִ�д�����
				System.out.println(Thread.currentThread().getName()+"��"+depositAmount);
				balance+=depositAmount;
				System.out.println("�˻����Ϊ"+balance);
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
