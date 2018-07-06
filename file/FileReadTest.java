package file;

import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(
			FileReader fr = new FileReader("C:\\Users\\su\\eclipse-workspace\\java\\src\\file\\FilenameFilterTest.java"))
		{
			char[] cbuf = new char[32];
			int hasRead = 0;
			while((hasRead=fr.read(cbuf))>0)
			{
				System.out.print(new String (cbuf,0,hasRead));
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}

	}

}
