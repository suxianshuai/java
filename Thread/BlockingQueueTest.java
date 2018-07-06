package Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer extends Thread{
	private BlockingQueue<String> bq;
	public Producer(BlockingQueue<String> bq)
	{
		this.bq = bq;
	}
	public void run()
	{
		String[] strArr = new String[] {
				"java",
				"Struts",
				"Spring"
		};
		for(int i=0;i<456;i++)
		{
			System.out.println(getName()+"������׼���������ϣ�");
			try
			{
				Thread.sleep(200);
				//���Է���Ԫ�أ��������������������
				bq.put(strArr[i%3]);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(getName()+"�������"+bq);
		}
		
	}

	
}
class Consumer extends Thread
{
	private BlockingQueue<String> bq;
	public Consumer(BlockingQueue<String> bq)
	{
		this.bq=bq;
	}
	public void run()
	{
		while(true)
		{
			System.out.println(getName()+"������׼������Ԫ��");
			try
			{
				Thread.sleep(200);
				//����ȡ��Ԫ�أ��������Ϊ�գ������
				bq.take();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(getName()+"�������"+bq);
		}
	}
}
public class BlockingQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<>(1);
        new  Producer(abq).start();
        new  Consumer(abq).start();
        new  Producer(abq).start();
        new  Producer(abq).start();
	}

}
