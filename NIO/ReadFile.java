package NIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class ReadFile {

	public static void main(String[] args) throws IOException{
		
		try(
				//创建文件流
				FileInputStream fis = new FileInputStream("F:\\copy\\eclipse-workspace\\java\\src\\NIO\\ReadFile.java");
				//创建一个FileChannel对象
				FileChannel fcin = fis.getChannel())
		{
			//定义一个ByteBuffer 重复取水
			ByteBuffer bbuffer = ByteBuffer.allocate(256);
			//将FileChannel中的数据放入ByteBuffer中
			while(fcin.read(bbuffer)!=-1)
			{
				//锁定空白区
				bbuffer.flip();
				//创建CharSet对象
				Charset charset = Charset.forName("GBK");
				//创建解码器对象
				CharsetDecoder decoder = charset.newDecoder();
				//将ByteBuffer的内容转码
				CharBuffer cbuff = decoder.decode(bbuffer);
				System.out.println(cbuff);
				bbuffer.clear();
			}
		}

	}

}
