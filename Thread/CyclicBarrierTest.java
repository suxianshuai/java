package Thread;
import java.util.concurrent.*;


public class CyclicBarrierTest {
	static class A implements Runnable
	{
		public void run()
		{
			System.out.println(3                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          );	
		}
		}
	static CyclicBarrier c = new CyclicBarrier(2,new A()); 
	

	public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
		// TODO Auto-generated method stub
		new Thread(new Runnable()
		{
			public void run()
			{
				try
				{
					c.await();
				}
				catch (Exception e)
				{
					
				}
				System.out.println(1);
			}
		}
          ).start();
		c.await();
		System.out.println(2);
		
	}

}
