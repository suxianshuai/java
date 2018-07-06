package file;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringNodeTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String src = "����������һ���Ҹ�����\n"
				+"ι��������������\n"
				+"�������𣬹�����ʳ���߲�\n"
				+"����һ�����ӣ��泯�󺣣���ů����\n"
				+"�������𣬺�ÿһ������ͨ��\n"
				+"���������ҵ��Ҹ�";
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
			sw.write("��һ��������������,\n");
			sw.write("����Զ�����ң�\n");
			sw.write("����������ĺ��ӣ�\n");
			sw.write("���й���ľ���\n");
			System.out.println(sw.toString());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
				
		
	}

}
