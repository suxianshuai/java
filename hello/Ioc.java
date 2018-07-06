package hello;
class Base{
	public void f()
	{
		System.out.println("Base");
	}
}
class Sub extends Base
{
	public void f() {
		System.out.println("Sub");
	}}
public class Ioc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class c=Class.forName("hello.Sub");
			Base b=(Base)c.newInstance();
			b.f();
			
		}catch(Exception e)
		{e.printStackTrace();}

	}

}
