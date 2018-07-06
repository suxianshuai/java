package composition;
import java.io.*;

public class Io {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1 = new File("e://file.txt");
		FileInputStream fi = new FileInputStream(file1.getAbsoluteFile());
    	InputStreamReader ir = new InputStreamReader(fi); 
    	BufferedReader br =new BufferedReader(ir);
//    	BufferedReader br =new BufferedReader(new FileReader("e://file.txt"));
//    	�ڴ����Ĺ����У������Ƚ�����һ��FileReader�����������Ĺ����Ǵ��ļ�"file.txt"�ж�ȡ�ֽ�(byte)������ת��Ϊ�ı�����
//    	��Java�У���׼���ı����뷽ʽΪunicode��BufferedReader()���ո�FileReader���󣬲���չFileReader�Ĺ��ܣ��½���һ��BufferedReader����
//    	�ö���������������ļ���ȡ��ת���Ĺ����⣬���ṩ�˻����ȡ(buffered)�Ĺ��ܡ��������ͨ����br�������readLine()�������������еĶ�ȡ�ļ���
//        (�����ȡ�����ڴ��п���һƬ������Ϊ���棬��������FileReader�������ı��������û�������ݱ����ߺ�(����readLine()����)���������غ������ı�����)
//    	BufferedReader()��һ��װ����(decorator)��������һ��ԭʼ�Ķ��󣬲�����һ������װ�εġ����ܸ����ӵĶ����������ĺô��ǣ��������������β�ͬ�Ķ���
//    	�������ﱻ���ε��Ǵ��ļ��ж�ȡ���ı������������ı����������׼���룬���紫������ȵȣ������Ա�BufferedReader()���Σ��Ӷ�ʵ�ֻ����ȡ
    	String line = br.readLine();
    	while (line !=null)
    	{
    		System.out.println(line);
    		line = br.readLine();
    	}
    	br.close();
 


   
    	String content = "Thank you for fish";
    	File file = new File("e://new.txt");
    	//Create the file if doesn't exists
    	if (!file.exists())
    	{
    		file.createNewFile();
    	}
    	FileOutputStream fs = new FileOutputStream(file.getAbsoluteFile());
    	OutputStreamWriter ow = new OutputStreamWriter(fs); 
//    	FileWriter fw = new FileWriter(file.getAbsoluteFile());
    	BufferedWriter bw = new BufferedWriter(ow);
    	bw.write(content);
    	bw.close();	
//    	��ʵ�ϣ�Java�ṩ�˷ḻ��װ������FileReader�кϲ��˶�ȡ��ת���������裬
//    	�������˳��õ�Ĭ�����ã���������ȡunicode�����ǿ���ʹ��FileInputStream + InputStreamReader
//    	����������FileReader���Ӷ������ȡ�ֽں�ת���������裬�������������и��õĿ��ơ� 

//    	(��Ȼ��FileReader��ʹ�ø��ӷ��㡣InputStreamReader�ǽ�FileInputStreamת����һ��Reader�����ڴ���unicode�ı�)	
 }
}