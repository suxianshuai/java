package file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    File file =new File(".");
    System.out.println(file.getName());
    System.out.println(file.getParent());
    System.out.println(file.getAbsoluteFile());
    System.out.println(file.getAbsoluteFile().getParent());
    File temfile = File.createTempFile("aaa", ".txt",file);
    temfile.deleteOnExit();
    File newFile =new File(System.currentTimeMillis() +"");
    System.out.println(newFile.exists());
    newFile.createNewFile();
    newFile.mkdir();
    String [] fileList=file.list();
    System.out.println("====当前路径如下====");
    for (String filename:fileList)
    {
    	System.out.println(filename);
    }    
    File [] roots=File.listRoots();
    for (File root:roots)
    {
    	System.out.println(root);
    }
	}

}
