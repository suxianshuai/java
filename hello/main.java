package hello;

public class main{
	 public static String maxRepat(String input) {  
	        // 参数检查  
	        if (input == null || input.length() == 0) {  
	            return null;  
	        }  
	        // 重复子串的最长长度  
	        int max = 0;  
	        // 最长重复子串的起始位置  
	        int first = 0;  
	        int k = 0;  
	        for (int i = 1; i < input.length(); i++) {  
	            for (int j = 0; j < input.length() - i; j++) {  
	                if (input.charAt(j) == input.charAt(i + j)) {  
	                    k++;  
	                } else {  
	                    k = 0;  
	                }  
	                if (k > max) {  
	                    max = k;  
	                    first = j - k + 1;  
	                }  
	            }  
	        }  
	        if (max > 0) {  
	            System.out.println(max);  
	            return input.substring(first, first + max);  
	        }  
	        return null;  
	    }  
public static void main(String[] args) {
    
    
    System.out.println(removerepeated("刚才我说了我要退款我要退款我要退款我都说了我要退款"));
}
public static String removerepeated(String s) {
    if (s == null)
        return s;
    StringBuffer sb = new StringBuffer();
    int i = 0, len = s.length();
   int j=0;
       String c = maxRepat(s);
       for(;i<len;i++)
       { if(c.length()>0&&s.charAt(i)==c.charAt(0)&&!s.substring(i, i+c.length()).equals(c))
    	   
        sb.append(i);}
      
     
    return sb.toString();
}}