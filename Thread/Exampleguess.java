package Thread;
class Number implements Runnable
{
	volatile int realNumber,guessNumber ,min=0,max=100,message;
	final int SMALLER=-1,LARGER=1,SUCCESS=8;
	Thread giveNumberThread,guessNumberThread;
	Number()
	{
		giveNumberThread = new Thread(this);
		guessNumberThread = new Thread(this);
		
	}
    public void run()
    {
    	for(int count=1;true;count++)
    	{
    		if(Thread.currentThread()==giveNumberThread)
    		{
    			if(count==1)
    			{
    				realNumber=(int)(Math.random()*100)+1;
    				System.out.println("�������һ�����²��Ƕ���");
    			}
    			else
    			{
    				if(realNumber>guessNumber)
    				{
    					message=SMALLER;
    					System.out.println("���С��");
    				}
    				else if(realNumber<guessNumber)
    				{
    					message=LARGER;
    					System.out.println("��´���");
    				}
    				else 
    				{
    					message=SUCCESS;
    					System.out.println("��ϲ����¶���");
    					return;
    				}
    				
    				
    			}
    			try{Thread.sleep(1500);
    			  }
    			catch(Exception e) {}
    			}
    	     if(Thread.currentThread()==guessNumberThread)
    	     {
    	    	 if(count==1)
    	    	 {
    	    		 guessNumber=(min+max)/2;
    	    		 System.out.println("�ҵ�"+count+"�βµ�������ǣ�"+guessNumber);
    	    	 }
    	    	 else 
    	    	 {
    	    		 if(message==SMALLER)
    	    		 {
    	    			 min=guessNumber;
    	    			 guessNumber=(min+max)/2;
    	    			 System.out.println("�ҵ�"+count+"�βµ�������ǣ�"+guessNumber);
    	    		 }
    	    		 else if(message==LARGER)
    	    		 {
    	    			 max=guessNumber;
    	    			 guessNumber=(min+max)/2;
    	    			 System.out.println("�ҵ�"+count+"�βµ�������ǣ�"+guessNumber);
    	    		 }
    	    		 else if(message==SUCCESS)
    	    		 {
    	    			 System.out.println("�ҳɹ���");
    	    			 return;
    	    		 }
    	    	 }
    	    	 try {
    	    		 Thread.sleep(1500);
    	    	 }catch(Exception e)
    	    	 {}
    	    	 
    	     }
    			
    		}
    	}
    }


public class Exampleguess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number number =new Number();
		number.giveNumberThread.start();
		number.guessNumberThread.start();

	}

}
