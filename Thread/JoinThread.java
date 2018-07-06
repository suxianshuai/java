package Thread;

import java.util.Map;

public class JoinThread extends Thread{
	public JoinThread(String name)
	{
		super(name);
		
	}
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(getName()+i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new JoinThread("新线程").start();
		for(Map.Entry<Thread, StackTraceElement[]>stackTrace:Thread.getAllStackTraces().entrySet())
		{
			Thread thread = (Thread) stackTrace.getKey();
			StackTraceElement[] stack =(StackTraceElement[])stackTrace.getValue();
			if(thread.equals(Thread.currentThread()))
				continue;
			System.out.println("线程"+thread.getName());
			for(StackTraceElement element:stack)
			{
				System.out.print("\t"+element+"\n");
			}
			
		}
		/*for(int i=0;i<100;i++)
		{
			if(i==20)
			{
				JoinThread jt  = new JoinThread("被join的线程");
				jt.start();
				//main线程调用了jt线程的join()方法，main线程
				//必须等jt执行结束才会向下执行
				jt.join();
				                                                        
				
			}
			System.out.println(Thread.currentThread().getName()+i);
		}
*/
	}

}
