package Thread;

public class YieldTest extends Thread{
	public YieldTest(String name)
	{
		super(name);
	}
	public void run()
	{
		for (int i=0;i<50;i++)
		{
			System.out.println(getName()+i);
			if(i==20)
				Thread.yield();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldTest yt1 = new YieldTest("�߼�");
		//��yt1�߳�����Ϊ������ȼ�
		//yt1.setPriority(Thread.MAX_PRIORITY);
		yt1.start();
		YieldTest yt2 = new YieldTest("�ͼ�");
		//yt2.setPriority(MIN_PRIORITY);
		yt2.start();
		

	}

}
