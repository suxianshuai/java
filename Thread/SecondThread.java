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
			//当线程类实现Runnable接口时
			//如果想获取当前线程，只能用Thread.currentThread()方法
			System.out.println(Thread.currentThread().getName()+"  "+i);
			
		}
		
	}

}
