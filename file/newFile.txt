package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class FileOutputStreamTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		try(
				FileInputStream fis = new FileInputStream("C:\\Users\\su\\eclipse-workspace\\java\\src\\file\\FileOutputStreamTest.java");
				FileOutputStream fos = new FileOutputStream("C:\\Users\\su\\eclipse-workspace\\java\\src\\file\\newFile.txt"))
		{
			byte[] bbuf = new byte[32];
			int hasRead =0;
			while((hasRead =fis.read(bbuf))>0)
			{
				fos.write(bbuf,0,hasRead);
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}

	}

}
