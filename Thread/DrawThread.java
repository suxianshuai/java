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
		/*//ʹ��account��Ϊͬ���������κ��߳̽�������ͬ������֮ǰ
		//�����Ȼ�ö�account�˻�������-�����߳��޷��������Ҳ�޷��޸���
		//�����������ϼ������޸ģ��ͷ������߼�
		synchronized(account)
		{
		if(account.getBalance()>=drawAmount)
		{
			System.out.println(getName()+"ȡǮ�ɹ����³���Ʊ��"+drawAmount);
			try
			{
				Thread.sleep(1);
				
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			account.setBalance(account.getBalance()-drawAmount);
			System.out.println("\t���Ϊ��"+account.getBalance());
		}
		else
		{
			System.out.println(getName()+"ȡǮʧ�ܣ����㣡");
		}
		}
		
*/
		for(int i=0;i<100;i++)
		{
		account.draw(drawAmount);
		}
	}
	
}
