package hello;
class Base1{
	public int i=1;
	public Base1() {
	g();
    }
	public void f(){
		System.out.println("Base f()");
    }
	public void g() {
		System.out.println("Base g()");
		
	}
	
	
}
class Derived extends Base1{
	public int i=2;
	public void f() {
		System.out.println("Derived f()");
	}
	public void g() {
	System.out.println("Derived g()");	
	}
	
}
   
public class Overlode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Base1 b= new Derived();
    b.f();
    b.g();
    System.out.println(b.i);
    //上例中，由于子类Derived 的f（）方法与父类Base的方法重名，因此，Derived的方法
    //会覆盖Base中的方法，在执行Base b=new Derived()语句时，会调用Base的构造函数g（）方法
    //由于java语言的多态性，此时会调用Derived类的g（）方法，因此会输出Derived g（）。
	}

}
