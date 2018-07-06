package Thread;

public class ThreadGroupTest {

	public static void main(String[] args) {
		// 获取主线程所在的线程组，这是所有线程默认的线程组
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		System.out.println("主线程的名字："+mainGroup.getName());
		System.out.println("主线程是否为后台线程组："+mainGroup.isDaemon());
		ThreadGroup tg = new ThreadGroup("新线程组");
		tg.setDaemon(true);
		System.out.println("tg是否为后台线程"+tg.isDaemon());
		myThread tt = new myThread(tg,"tg组里的线程");
	}

}
