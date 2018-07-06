package queue;

public class SeqQueue implements Queue {
	static final int defaultSize = 10;
	int front;//队头
	int rear;//队尾
	int count;//元素个数计数器
	int maxSize;//最大数据元素个数
	Object []data;//保存队列的数组
	public SeqQueue()
	{
		initiate(defaultSize);//无参构造函数
		
	}
	public SeqQueue(int sz)
	{
		initiate(sz);//有参构造函数
		
	}
	private void initiate(int sz)//初始化
	{
		maxSize = sz;
		front = 0;
		rear = 0;
		data = new Object[sz];
	}
	public void append(Object obj) throws Exception {
		// TODO Auto-generated method stub
		if(count>0&&front==rear)
				throw new Exception(" 队列已满");
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
	


