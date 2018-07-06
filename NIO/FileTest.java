package NIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class FileTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//�����ļ�
		
     	Files.copy(Paths.get("F:\\copy\\eclipse-workspace\\java\\src\\NIO\\FileTest.java"),new FileOutputStream("F:\\copy\\eclipse-workspace\\java\\src\\NIO\\a.txt"));
	    //�ж�FileTest.java�ļ��Ƿ�Ϊ�����ļ�
//     	System.out.println("FileTest.java�Ƿ��������ļ��У�"+Files.isHidden(Paths.get("F:\\copy\\eclipse-workspace\\java\\src\\NIO\\FileTest.java")));
     	//һ���Զ�ȡFile.java�ļ��е�������
     	List<String> lines = Files.readAllLines(Paths.get("F:\\copy\\eclipse-workspace\\java\\src\\NIO\\FileTest.java"),Charset.forName("gbk"));
     	/*Iterator<String> it = lines.iterator();
     	while(it.hasNext())
     	{
     		System.out.println(it.next());
     	}
     	for(int i=0;i<lines.size();i++)
     	{
     		System.out.println(lines.get(i));
     	}
     	for(String line:lines)
     	{
     		System.out.println(line);
     	}*/
     	//�ж��ļ��Ĵ�С
     	System.out.println("FileTest.java���ļ���СΪ��"+Files.size(Paths.get("F:\\copy\\eclipse-workspace\\java\\src\\NIO\\FileTest.java")));
     	List<String> poem = new ArrayList<>();
     	poem.add("ˮ��̷������Ծ");
     	poem.add("������б̲���");
     	//ֱ�ӽ�����ַ���д��ָ���ļ�����
     	Files.write(Paths.get("poem.txt"),poem,Charset.forName("gbk"));
     	//ʹ��Java8������Stream API��ȡ�ļ������г�
     	Files.list(Paths.get(".")).forEach(path->System.out.println(path));
     	FileStore cStore = Files.getFileStore(Paths.get("C:"));
     	//�ж�c�̵��ܿռ�
     	System.out.println("C:���пռ�"+ cStore.getTotalSpace());
     	System.out.println("C:���пռ�"+ cStore.getUsableSpace());
	}

}
