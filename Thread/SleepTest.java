package Thread;

import java.util.Date;

public class SleepTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println("��ǰʱ�䣺"+new Date());
			Thread.sleep(1000);
		}
	

	}

}
