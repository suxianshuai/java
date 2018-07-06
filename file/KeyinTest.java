package file;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyinTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(
				InputStreamReader reader = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(reader)
			)
		{
			String line = null;
			while((line = br.readLine())!=null)
			{
			if(!line.equals("exit"))
			{
				System.out.println(line);
			}
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}

	}

}
