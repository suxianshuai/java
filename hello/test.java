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
//		Class����"�����"(class of classes)�����˵���Ƕ���ĳ���ͼ��ϵĻ���
//		��ôClass����Ƕ���ĳ���ͼ��ϡ�
//      ÿһ��Class��Ķ������һ���������ࡣ��������ĳ����У�Class��Ķ���c1
//      ������Human�࣬c2������Woman��
		Class c1 = H.getClass();
		Class c2 = W.getClass();
		Class c3 = Class.forName("hello.Human");
		Class c4  = Woman.class;
		 
		
//		���ǵ��ö����getClass()����ʱ���͵õ���ӦClass��������á�
//		��c2�У���ʹ���ǽ�Women�������������ת��ΪHuman��������ã�������ָ���Class�������Ȼ��Woman��
//		Java��ÿ����������Ӧ��Class�������ˣ�������ʱ��ͨ��Class����֪��ĳ�������������������ࡣ
//		�������Ƕ����ý�������������ת��������������Ӧ��Class������ͬһ����������ͨ��ĳ�����õ��÷���ʱ��
//		Java�����ҵ���ȷ��Class����������ķ�������ִ�и�Class���еĴ��롣
//		����Class����Ĵ��ڣ�Java������Ϊ���͵�����ת������ʧ������Ƕ�̬��ԭ��
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getFields()  );
		System.out.println(c4.getMethods()  );
//		getFields()       �������е�public���ݳ�Ա
//
//		getMethods()      �������е�public����
		
		}

	

}
