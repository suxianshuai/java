package Thread;

public class Account {
	private  String accountNo;
	private double balance;
	public Account() {}
	public Account(String accountNo,double balance)
	{
		this.accountNo = accountNo;
		this.balance  = balance;
	}
    public int hashCode()
    {
    	return accountNo.hashCode();
    }
    public boolean equals(Object obj)
    {
    	if(this==obj)
    		return true;
    	if(obj!=null&&obj.getClass()==Account.class)
    	{
    		Account target = (Account)obj;
    		return target.getAccountNo().equals(accountNo);
    	}
    	return false;
    }
	private String getAccountNo() {
		// TODO Auto-generated method stub
		return this.accountNo;
	}
	
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}
	public void setBalance(double d) {
		// TODO Auto-generated method stub
		this.balance=d;
		
	}
	public synchronized void draw(double drawAmount)
	{

		if(balance>=drawAmount)
		{
			System.out.println(Thread.currentThread().getName()+"取钱成功！吐出钞票："+drawAmount);
			try
			{
				Thread.sleep(1);
				
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			balance -=drawAmount;
			System.out.println("\t余额为："+balance);
		}
		else
		{
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
