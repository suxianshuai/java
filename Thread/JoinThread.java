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
		new JoinThread("���߳�").start();
		for(Map.Entry<Thread, StackTraceElement[]>stackTrace:Thread.getAllStackTraces().entrySet())
		{
			Thread thread = (Thread) stackTrace.getKey();
			StackTraceElement[] stack =(StackTraceElement[])stackTrace.getValue();
			if(thread.equals(Thread.currentThread()))
				continue;
			System.out.println("�߳�"+thread.getName());
			for(StackTraceElement element:stack)
			{
				System.out.print("\t"+element+"\n");
			}
			
		}
		/*for(int i=0;i<100;i++)
		{
			if(i==20)
			{
				JoinThread jt  = new JoinThread("��join���߳�");
				jt.start();
				//main�̵߳�����jt�̵߳�join()������main�߳�
				//�����jtִ�н����Ż�����ִ��
				jt.join();
				                                                        
				
			}
			System.out.println(Thread.currentThread().getName()+i);
		}
*/
	}

}
