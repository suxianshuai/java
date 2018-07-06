package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Object> books = new LinkedHashSet<>();
		//HashSet<Object> books = new HashSet<>();
		books.add("疯狂Java讲义");
		books.add("轻量级Java实践");
		System.out.println(books);
		books.remove("疯狂Java讲义");
		books.add("疯狂Java讲义");
		System.out.println(books);
		

	}

}
