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
			System.out.println(getName()+"生产者准备生产集合！");
			try
			{
				Thread.sleep(200);
				//尝试放入元素，如果队列已满，则阻塞
				bq.put(strArr[i%3]);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(getName()+"生产完成"+bq);
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
			System.out.println(getName()+"消费者准备消费元素");
			try
			{
				Thread.sleep(200);
				//尝试取出元素，如果队列为空，则堵塞
				bq.take();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(getName()+"消费完成"+bq);
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
