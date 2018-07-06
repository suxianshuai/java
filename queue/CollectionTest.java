package queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import java.util.Iterator;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class CollectionTest {
	 public static int calAll(Collection books,Predicate p)
     {
   	  int total=0;
   	  for(Object obj:books)
   	  {
   		  if(p.test(obj))
   		  {
   			  total++;
   		  }
   	  }
   	  return total;
   	  
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Collection<Object> c = new ArrayList<>();
//      c.add("孙悟空");
//      c.add(6);
//      System.out.println(c.size());
//      c.remove(6);
//      System.out.println(c.size());
//      System.out.println(c.contains("孙悟空"));
//      c.add("轻量级Java EE企业应用实践");
//      System.out.println("c的集合"+c);
      Collection<Object> books = new HashSet<>();
      books.add("轻量级Java EE企业应用实践");
      books.add("疯狂Java讲义");
      books.add("疯狂Android讲义");
      
      System.out.println(books);
      books.removeIf(ele -> ((String) ele).length()<10);
      System.out.println(books);
      System.out.println(calAll(books,ele ->((String)ele).contains("疯狂")));
      System.out.println(calAll(books,ele ->((String)ele).contains("Java")));
      System.out.println(calAll(books,e -> ((String) e).length()>10));
      IntStream is = IntStream.builder().add(20)
    		  .add(13)
    		  .add(-2)
    		  .add(18)
    		  .build();
      //System.out.println(is.max().getAsInt());
      //System.out.println(is.anyMatch(ele ->ele*ele>20));
      IntStream newIs = is.map(ele->ele*2 +1);
      newIs.forEach(System.out::println);
      System.out.println(books.stream().filter(ele->((String)ele).contains("Java")).count());
      
      
     
      //Lambda表达式
//      books.forEach(obj ->System.out.println("迭代元素："+obj));
//      Object [] Arraybooks=books.toArray();
//      System.out.println("Arraybooks数组第一个"+Arraybooks[0]);
//      System.out.println("是否完全包含于books"+c.containsAll(books));
//      //用c集合减去book集合的所有元素
//      c.removeAll(books);
//      System.out.println("c的集合"+c);
//      c.clear();
//      System.out.println("c的集合"+c);
//      books.retainAll(c);//控制books只剩下c中的元素
//      System.out.println("book中的集合元素"+books);
//      Iterator<Object> it = books.iterator();
//      //it.forEachRemaining(obj ->System.out.println("迭代元素是"+obj));
//      for (Object  obj :books)
//      {
//    	  String book = (String)obj;
//    	  System.out.println(book);
//    	
//      }
//      while(it.hasNext())
//      {
//    	  String book = (String)it.next();
//    	 
//    	
//    	  if(book.equals("轻量级Java EE企业应用实践"))
//    	  {
//    		  it.remove();
//    	    	 
//    	   }
//    	 // book="测试字符窜";
//    	// System.out.println("<<<<<<<<<<<<<<<<<<<<");
//    	  //System.out.println(books);
//    	  System.out.println(book);
//      }
//      System.out.println(books);
      
      
	}

}
