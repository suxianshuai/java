package test;

import java.util.Map;

public class Ma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double i = Dd.sqrt(4);
      System.out.println(i);
      Map<String,String> env = System.getenv();
      for(String name:env.keySet())
      {
    	  System.out.println(name +"-->"+env.get(name));
    	  System.out.println(System.getenv("JAVA_HOME"));
    	  
    	  
      }
      
	}

}
