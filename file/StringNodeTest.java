package file;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringNodeTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String src = "从明天起，做一个幸福的人\n"
				+"喂马，劈柴，周游世界\n"
				+"从明天起，关心粮食和蔬菜\n"
				+"我有一所房子，面朝大海，春暖花开\n"
				+"从明天起，和每一个亲人通信\n"
				+"告诉他们我的幸福";
		char[] buffer = new char[32];
		int hasRead = 0;
		try (
				StringReader sr = new StringReader(src))
		{
			while((hasRead = sr.read(buffer))>0)
			{
				System.out.print(new String (buffer,0,hasRead));
			}
			
		}catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		try(
			StringWriter sw = new StringWriter())
		{
			sw.write("有一个美丽的新世界,\n");
			sw.write("他在远方等我，\n");
			sw.write("哪里有天真的孩子，\n");
			sw.write("还有姑娘的酒窝\n");
			System.out.println(sw.toString());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
				
		
	}

}
