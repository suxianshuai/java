package Thread;

public class InvokeRun extends Thread{
	public int i;
	public void run()
	{
		for(;i<100;i++)
		{
			//ֱ�ӵ���run()������Thread��this.getName()���ظö��������
			//�����ǵ�ǰ�̵߳�����
			//ʹ��Thread.currentThread().getName()
			System.out.println(Thread.currentThread().getName()+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++)
		{
			//����Thread��currentThread����������ȡ��ǰ�߳�
			System.out.println(Thread.currentThread().getName()+i);
			if(i==20)
			{
				//ֱ�ӵ����̶߳����run����
				//ϵͳ����̶߳��󵱳���ͨ����
				//�����������д��벢�������������̣߳���������ִ������run����
				new InvokeRun().run();
				new InvokeRun().run();
			}
		}

	}

}
