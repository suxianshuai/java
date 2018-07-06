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
//      c.add("�����");
//      c.add(6);
//      System.out.println(c.size());
//      c.remove(6);
//      System.out.println(c.size());
//      System.out.println(c.contains("�����"));
//      c.add("������Java EE��ҵӦ��ʵ��");
//      System.out.println("c�ļ���"+c);
      Collection<Object> books = new HashSet<>();
      books.add("������Java EE��ҵӦ��ʵ��");
      books.add("���Java����");
      books.add("���Android����");
      
      System.out.println(books);
      books.removeIf(ele -> ((String) ele).length()<10);
      System.out.println(books);
      System.out.println(calAll(books,ele ->((String)ele).contains("���")));
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
      
      
     
      //Lambda���ʽ
//      books.forEach(obj ->System.out.println("����Ԫ�أ�"+obj));
//      Object [] Arraybooks=books.toArray();
//      System.out.println("Arraybooks�����һ��"+Arraybooks[0]);
//      System.out.println("�Ƿ���ȫ������books"+c.containsAll(books));
//      //��c���ϼ�ȥbook���ϵ�����Ԫ��
//      c.removeAll(books);
//      System.out.println("c�ļ���"+c);
//      c.clear();
//      System.out.println("c�ļ���"+c);
//      books.retainAll(c);//����booksֻʣ��c�е�Ԫ��
//      System.out.println("book�еļ���Ԫ��"+books);
//      Iterator<Object> it = books.iterator();
//      //it.forEachRemaining(obj ->System.out.println("����Ԫ����"+obj));
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
//    	  if(book.equals("������Java EE��ҵӦ��ʵ��"))
//    	  {
//    		  it.remove();
//    	    	 
//    	   }
//    	 // book="�����ַ���";
//    	// System.out.println("<<<<<<<<<<<<<<<<<<<<");
//    	  //System.out.println(books);
//    	  System.out.println(book);
//      }
//      System.out.println(books);
      
      
	}

}
