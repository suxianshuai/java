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
//    	在创建的过程中，我们先建立了一个FileReader对象，这个对象的功能是从文件"file.txt"中读取字节(byte)流，并转换为文本流。
//    	在Java中，标准的文本编码方式为unicode。BufferedReader()接收该FileReader对象，并拓展FileReader的功能，新建出一个BufferedReader对象。
//    	该对象除了有上述的文件读取和转换的功能外，还提供了缓存读取(buffered)的功能。最后，我们通过对br对象调用readLine()方法，可以逐行的读取文件。
//        (缓存读取是在内存中开辟一片区域作为缓存，该区域存放FileReader读出的文本流。当该缓存的内容被读走后(比如readLine()命令)，缓存会加载后续的文本流。)
//    	BufferedReader()是一个装饰器(decorator)，它接收一个原始的对象，并返回一个经过装饰的、功能更复杂的对象。修饰器的好处是，它可以用于修饰不同的对象。
//    	我们这里被修饰的是从文件中读取的文本流。其他的文本流，比如标准输入，网络传输的流等等，都可以被BufferedReader()修饰，从而实现缓存读取
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
//    	事实上，Java提供了丰富的装饰器。FileReader中合并了读取和转换两个步骤，
//    	并采用了常用的默认设置，比如编码采取unicode。我们可以使用FileInputStream + InputStreamReader
//    	的组合来替代FileReader，从而分离读取字节和转换两个步骤，并对两个过程有更好的控制。 

//    	(当然，FileReader的使用更加方便。InputStreamReader是将FileInputStream转换成一个Reader，用于处理unicode文本)	
 }
}