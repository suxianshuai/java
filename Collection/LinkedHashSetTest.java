package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Object> books = new LinkedHashSet<>();
		//HashSet<Object> books = new HashSet<>();
		books.add("���Java����");
		books.add("������Javaʵ��");
		System.out.println(books);
		books.remove("���Java����");
		books.add("���Java����");
		System.out.println(books);
		

	}

}
