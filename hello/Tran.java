package hello;

import java.util.Arrays;

public class Tran {
    final String str;
    final static double d;
    final char c;
	   static
       {
       	d=5.6;
       }
       {
       	str="Hello";
       	
       }
       public Tran()
       {
    	   c=5+'0';
    	   
       }
       public void changeFinal()
       {
    	   
       }
       class Person 
       {
    	   private int age;
    	   public Person() {}
    	   public Person(int age)
    	   {
    		   this.age=age;
    	   }
    	   public int getAge()
    	   {
    		   return age;
    	   }
    	   public void setAge(int age)
    	   {
    		   this.age=age;
    	   }
    	   
       }
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d =13.4;
		long l =(long)d;
		System.out.println(l);
		int in =5;
		//boolean b = (boolean)in;
		Object o = "Hello";
		String obj =(String)o;
		System.out.println(obj);
		Object objPri = new Integer(5);
		if(objPri instanceof String)
		{String str =(String)objPri;
		System.out.println(str);}
		Object hello ="hello";
		System.out.println(hello instanceof Object);
		System.out.println(hello instanceof String);
		System.out.println(hello instanceof Math);
		System.out.println(hello instanceof Comparable);
		Integer inobj = 5;
		Object boolObj = true;
		int it =inobj;
        if(boolObj instanceof Boolean)
        {
        	boolean b = (Boolean)boolObj;
        	System.out.println(b);
        	
        }
        String intStr ="123";
        int it1 = Integer.parseInt(intStr);
        int it2 =  new Integer(intStr);
        System.out.println(it2);
        String  floatStr = "4.56";
        float ft1 = Float.parseFloat(floatStr);
        float ft2 = new Float(floatStr);
        String ftStr =String.valueOf(2.345f);
        String dbStr=String.valueOf(3.344);
        String boolStr =String.valueOf(true);
        Tran tr =new Tran();
        System.out.println(tr.str);
        System.out.println(tr.d);
        System.out.println(tr.c);
        final int[] iArr= {5,6,7,12,9};
        System.out.println(Arrays.toString(iArr));
        Arrays.sort(iArr);
        iArr[2]=-8;
        System.out.println(Arrays.toString(iArr));
        final Tran.Person p = new Tran().new Person();
        p.setAge(23);
        System.out.println(p.getAge());
        final int a=5;
        System.out.println(a);
        final int c = 5+2;
        final double b= 1.2/3;
        final String book="·è¿ñjava½²Òå:"+99.0;
        final String book2 ="·è¿ñjava½²Òå:"+String.valueOf(99.0);
        System.out.println(book=="·è¿ñjava½²Òå:99.0");
        System.out.println(book2=="·è¿ñjava½²Òå:99.0");
        String s1="·è¿ñjava";
        String s2 ="·è¿ñ"+"java";
        System.out.println(s1==s2);
        String str1 ="·è¿ñ";
        String str2 ="java";
        String s3 =str1 +str2;
        System.out.println(s1==s3);
       
     
		
		

	}

}
