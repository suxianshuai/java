package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		try(
			FileOutputStream fos = new FileOutputStream("C:\\Users\\su\\eclipse-workspace\\java\\src\\file\\poem.txt");
				PrintStream ps = new PrintStream(fos))
		{
			ps.println("ÆÕÍ¨×Ö·û´®");
			ps.println(new PrintStreamTest());
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}

	}

}
