package Thread;

public class myThread extends Thread{
	public myThread(String name)
	{
		super(name);
	}
	public myThread(ThreadGroup group,String name)
	{
		super(group,name);
	}
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(getName()+i);
		}
	}

}
