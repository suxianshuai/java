package Thread;

public class DaemonThread extends Thread {
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(getName()+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     DaemonThread t = new DaemonThread();
     t.setDaemon(true);
     t.start();
     for(int i=0;i<100;i++)
     {
    	 System.out.println(Thread.currentThread().getName()+i);
     }
	}

}
