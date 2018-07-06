package queue;

public class SeqQueue implements Queue {
	static final int defaultSize = 10;
	int front;//��ͷ
	int rear;//��β
	int count;//Ԫ�ظ���������
	int maxSize;//�������Ԫ�ظ���
	Object []data;//������е�����
	public SeqQueue()
	{
		initiate(defaultSize);//�޲ι��캯��
		
	}
	public SeqQueue(int sz)
	{
		initiate(sz);//�вι��캯��
		
	}
	private void initiate(int sz)//��ʼ��
	{
		maxSize = sz;
		front = 0;
		rear = 0;
		data = new Object[sz];
	}
	public void append(Object obj) throws Exception {
		// TODO Auto-generated method stub
		if(count>0&&front==rear)
				throw new Exception(" ��������");
		data[rear]= obj;
		rear=(rear+1)%maxSize;
		count++;
	}
	
	public Object delete() throws Exception {
		// TODO Auto-generated method stub
		Object temp = data[front];
		data[front]=null;
		front =(front+1)%maxSize;
		count--;
		return temp;
		
	}
	
	public Object getFront() throws Exception {
		// TODO Auto-generated method stub
		if(data[front]!=null)
		
		    return data[front];
		return null;
	}
	@Override
	public boolean notEmpty() {
		// TODO Auto-generated method stub
		return count==0&&front==rear?true:false;
	}


	}
	


