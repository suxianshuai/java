package Thread;

import java.util.concurrent.locks.ReentrantLock;

public class X {
	private final  ReentrantLock lock = new ReentrantLock();
	public void m()
	{
		 //¼ÓËø
		lock.lock();
		try
		{
			//
		}
		finally
		{
			lock.unlock();
		}
		
	}
	public static void main(String[] args) {
		

	}

}
