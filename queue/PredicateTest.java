package queue;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PredicateTest {
	public static int calAll(Collection<Object> books,Predicate<Object>  p)
	{
		int total=0;
		Iterator<Object> it = books.iterator();
		while(it.hasNext())
		{
			Object book=(Object)it.next();
			if(p.test(book)) {
				total++;
			}
		}
		return total;
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Collection<Object> books = new HashSet<>();
	      books.add("轻量级Java EE企业应用实践");
	      books.add("疯狂Java讲义");
	      books.add("疯狂Android讲义");
	      
		System.out.println(calAll(books,ele->((String) ele).contains("疯狂")));
		IntStream is=IntStream.builder().add(20).add(13).add(-2).add(18).build();
		System.out.println(is.max().getAsInt());
		System.out.println(is.allMatch(ele->ele*ele>20));
		IntStream newIs=is.map(ele->ele*2+1);
		newIs.forEach(System.out::println);

	}




}
