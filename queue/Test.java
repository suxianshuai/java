package queue;


public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SeqQueue s = new SeqQueue(12);  
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};  
        for(int i =0;i<months.length;i++){  
            s.append(months[i]);  
        }  
        System.out.println(s.maxSize+" "+s.notEmpty());  
        for(int i =0;i<months.length;i++){  
            System.out.println( s.delete());  
        }  
        System.out.println(s.maxSize+" "+s.notEmpty());  
        //²âÊÔÕ»×Ô¶¯À©ÈÝ  
        for(int i = 0;i<10;i++){  
            s.append(i+"");  
        }  
        System.out.println(s.maxSize+" "+s.notEmpty());  
        for(int i = 10;i<20;i++){  
            s.append(i+"");  
        }  
        System.out.println(s.maxSize+" "+s.notEmpty()); 

	}

}
