package Thread;

public class SecondThread implements Runnable {
	private int i ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondThread st = new SecondThread();
		for(int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName()+i);
			if(i==20)
			{
				new Thread(st,"su").start();
				new Thread(st,"li").start();
			}
		}
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(;i<100;i++)
		{
			//���߳���ʵ��Runnable�ӿ�ʱ
			//������ȡ��ǰ�̣߳�ֻ����Thread.currentThread()����
			System.out.println(Thread.currentThread().getName()+"  "+i);
			
		}
		
	}

}
