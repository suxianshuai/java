package Collection;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.TreeSet;

class M
{
	int age;
	public M(int age)
	{
		this.age=age;
	}
	public String toString()
	{
		return "M[age:"+age+"]";
	}
}
public class TreeSetTest2 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		TreeSet<Object> ts=new TreeSet<>((ele1,ele2)->
		{M m1=(M)ele1;
		 M m2=(M)ele2;
		 return m1.age>m2.age?-1:m1.age<m2.age?1:0;
		
	}) ;
		ts.add(new M(5));
		ts.add(new M(5));
		ts.add(new M(9));
		System.out.println(ts);
//		int[] b= {1,1,1,1,0};
//		InputStreamReader ins=new InputStreamReader( (InputStream) Arrays.stream(b));
//		BufferedReader br=new BufferedReader(ins);
//		System.out.println(br);
//		
        
	}

}
