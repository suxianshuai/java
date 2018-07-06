package Thread;

public class InvokeRun extends Thread{
	public int i;
	public void run()
	{
		for(;i<100;i++)
		{
			//直接调用run()方法，Thread的this.getName()返回该对象的名字
			//而不是当前线程的名字
			//使用Thread.currentThread().getName()
			System.out.println(Thread.currentThread().getName()+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++)
		{
			//调用Thread的currentThread（）方法获取当前线程
			System.out.println(Thread.currentThread().getName()+i);
			if(i==20)
			{
				//直接调用线程对象的run方法
				//系统会把线程对象当成普通对象
				//所以下面两行代码并不会启动两个线程，而是依次执行两个run方法
				new InvokeRun().run();
				new InvokeRun().run();
			}
		}

	}

}
