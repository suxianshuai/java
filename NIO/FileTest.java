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
		//复制文件
		
     	Files.copy(Paths.get("F:\\copy\\eclipse-workspace\\java\\src\\NIO\\FileTest.java"),new FileOutputStream("F:\\copy\\eclipse-workspace\\java\\src\\NIO\\a.txt"));
	    //判断FileTest.java文件是否为隐藏文件
//     	System.out.println("FileTest.java是否是隐藏文件夹："+Files.isHidden(Paths.get("F:\\copy\\eclipse-workspace\\java\\src\\NIO\\FileTest.java")));
     	//一次性读取File.java文件中的所有行
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
     	//判断文件的大小
     	System.out.println("FileTest.java的文件大小为："+Files.size(Paths.get("F:\\copy\\eclipse-workspace\\java\\src\\NIO\\FileTest.java")));
     	List<String> poem = new ArrayList<>();
     	poem.add("水晶谭底银鱼跃");
     	poem.add("清徐风中碧波横");
     	//直接将多个字符串写入指定文件夹中
     	Files.write(Paths.get("poem.txt"),poem,Charset.forName("gbk"));
     	//使用Java8新增的Stream API读取文件内容列出
     	Files.list(Paths.get(".")).forEach(path->System.out.println(path));
     	FileStore cStore = Files.getFileStore(Paths.get("C:"));
     	//判断c盘的总空间
     	System.out.println("C:共有空间"+ cStore.getTotalSpace());
     	System.out.println("C:共有空间"+ cStore.getUsableSpace());
	}

}
