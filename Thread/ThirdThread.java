package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThirdThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThirdThread rt = new ThirdThread();
		FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>)()->
		{
			int i=0;
			for(;i<100;i++)
			{
				System.out.println(Thread.currentThread().getName() + i);
			}
		
			return i;
			
		})  ;
		for(int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName()+i);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(i==20)
			{
				new Thread(task,"有返回值新线程").start();
				
			}
			try {
				System.out.println(task.get());
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			
		}

	}

}
