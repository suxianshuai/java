package Thread;

public class ThreadGroupTest {

	public static void main(String[] args) {
		// ��ȡ���߳����ڵ��߳��飬���������߳�Ĭ�ϵ��߳���
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		System.out.println("���̵߳����֣�"+mainGroup.getName());
		System.out.println("���߳��Ƿ�Ϊ��̨�߳��飺"+mainGroup.isDaemon());
		ThreadGroup tg = new ThreadGroup("���߳���");
		tg.setDaemon(true);
		System.out.println("tg�Ƿ�Ϊ��̨�߳�"+tg.isDaemon());
		myThread tt = new myThread(tg,"tg������߳�");
	}

}
