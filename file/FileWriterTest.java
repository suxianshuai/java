package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(
		  FileWriter fw = new FileWriter("C:\\Users\\su\\eclipse-workspace\\java\\src\\file\\poem.txt"))
		{
			fw.write("��ɪ-������\r\n");
			fw.write("��ɪ�޶���ʮ�ң�һ��һ��˼���ꡣ\r\n");
			fw.write("ׯ�������Ժ��������۴����жž顣\r\n");
			fw.write("�׺����������ᣬ������ů�����̡�\r\n");
			fw.write("����ɴ���׷�䣬ֻ�ǵ�ʱ���Ȼ��\r\n");	
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
				

	}

}
