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
    //�����У���������Derived ��f���������븸��Base�ķ�����������ˣ�Derived�ķ���
    //�Ḳ��Base�еķ�������ִ��Base b=new Derived()���ʱ�������Base�Ĺ��캯��g��������
    //����java���ԵĶ�̬�ԣ���ʱ�����Derived���g������������˻����Derived g������
	}

}
