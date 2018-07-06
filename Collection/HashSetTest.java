package Collection;

import java.util.HashSet;

//HashSet 是不同步的
//判断HashSet两个元素相等的标准是两个对象通过equals()比较相等，并且
//两个对象的hashCode()方法返回值相等
class A
{
	public boolean equals(Object obj)
	{
		return true;
	}
	}
class B
{
	public int hashCode()
	{
		return 1;
	}
}
class C
{
	public boolean equals(Object obj)
	{
		return true;
	}
	public int hashCode()
	{
		return 2;
	}
}
public class HashSetTest {
	public static void main(String[] args)
	{
		HashSet books = new HashSet();
		books.add(new A());	
		books.add(new A());	
		books.add(new B());	
		books.add(new B());	
		books.add(new C());	
		books.add(new C());	
		System.out.println(books);		
	}
	

}
