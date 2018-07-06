package test;

public class NewThread  extends Thread{

	   private static  int threadID=0;
	   public NewThread()
	   {
		   super("ID:"+(++threadID));
		   
	   }
	   public  String toString()
	   {
		   return super.getName();
	   }
	   public void run()
	   {
		   System.out.println(this);
		   
	   }
	   
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewThread thread1 = new NewThread();
		NewThread  thread2 = new NewThread();
		thread1.start();
		thread2.start();
		
		

	}

}
