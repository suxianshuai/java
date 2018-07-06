package hello;

import java.util.Scanner;

public class test {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
//		    Scanner sc = new Scanner(System.in);
//		
//		    int m = sc.nextInt();
//		    String n =sc.next();
//			Human apeason =new  Human(m,n);
//			Human dummyPerson = apeason;
//			System.out.println(dummyPerson .getHeight());
//			apeason.growHeight(20);
//			System.out.println(dummyPerson .getHeight());
//			System.out.println(apeason.getHeight());
//			apeason.growHeight(10);
//			System.out.println(apeason.getHeight());
//			//apeason.repeatBreath(4);
//			Woman w = new Woman(20);
//			w.breath();
//			System.out.println(w.width);
//			System.out.println(Human.getPopulation());
//			System.out.println(apeason.getPopulation());
		Human H = new Human(5);
		Human W = new Woman(6);
//		Human H = new Woman(5);
//   	Woman W = new Woman(6);   b     
// 		H = W;
		System.out.println(W.book);
		H.breath();
		Cup xuebi = new Cup();
		H.drink(xuebi, 10);
		System.out.println(H.getHeight());
//		Class类是"类的类"(class of classes)。如果说类是对象的抽象和集合的话，
//		那么Class类就是对类的抽象和集合。
//      每一个Class类的对象代表一个其他的类。比如下面的程序中，Class类的对象c1
//      代表了Human类，c2代表了Woman类
		Class c1 = H.getClass();
		Class c2 = W.getClass();
		Class c3 = Class.forName("hello.Human");
		Class c4  = Woman.class;
		 
		
//		我们调用对象的getClass()方法时，就得到对应Class对象的引用。
//		在c2中，即使我们将Women对象的引用向上转换为Human对象的引用，对象所指向的Class类对象依然是Woman。
//		Java中每个对象都有相应的Class类对象，因此，我们随时能通过Class对象知道某个对象“真正”所属的类。
//		无论我们对引用进行怎样的类型转换，对象本身所对应的Class对象都是同一个。当我们通过某个引用调用方法时，
//		Java总能找到正确的Class类中所定义的方法，并执行该Class类中的代码。
//		由于Class对象的存在，Java不会因为类型的向上转换而迷失。这就是多态的原理。
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getFields()  );
		System.out.println(c4.getMethods()  );
//		getFields()       返回所有的public数据成员
//
//		getMethods()      返回所有的public方法
		
		}

	

}
