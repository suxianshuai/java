package file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\su\\eclipse-workspace\\java\\src\\file\\FilenameFilterTest.java");
		byte[] bbuf = new byte[1024];
		int hasRead=0;
		while((hasRead = fis.read(bbuf))>0)
		{
			System.out.println(new String(bbuf,0,hasRead));
		}
		fis.close();
		fis.hashCode();

	}

	
}
