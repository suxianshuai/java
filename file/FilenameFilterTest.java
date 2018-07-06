package file;

import java.io.File;

public class FilenameFilterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(".");
		String [] nameList = file.list((dir,name)->name.endsWith(".java")||new File(name).isDirectory());
        for(String name :nameList)
        {
        	System.out.println(name);
        }
       int a=98;
       System.out.println((char)a);
       char  b='\n';
       char c='\u9999';
       System.out.println(c);
	}

}
