package Thread;

public class SecondTread implements Runnable {
	private int i=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName()+i);
			if(i==20)
			{
				SecondThread st = new SecondThread();
				//ͨ��new Thread(target,name)�����������߳�
				new Thread(st,"���߳�1").start();
				new Thread(st,"���߳�2").start();
			}
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (;i<100;i++)
		{
			//���߳���ʵ��Runnable�ӿ�ʱ
			//������ȡ��ǰ�̣߳�ֻ����Thread.currentThread()����
			System.out.println(Thread.currentThread().getName()+i);
			
		}
		
	}

}
