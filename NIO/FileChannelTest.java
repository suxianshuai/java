package NIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class FileChannelTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\su\\eclipse-workspace\\java\\src\\NIO\\FileChannelTest.java");
		try (
			//创建FileInputstream 以文件输入流创建FileChannel
			FileChannel inChannel = new FileInputStream(f).getChannel();
			//以文件输出流创建FileChannel，用于控制输出
			FileChannel outChannel = new FileOutputStream("C:\\Users\\su\\eclipse-workspace\\java\\newFile.txt").getChannel();
			
		)
		{
			//将FileChannel的全部数据映射成ByteBuffer
			MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY,0,f.length());
			//使用GBK数据集来创建解码器
			Charset charset = Charset.forName("GBK");
			outChannel.write(buffer);
			//再次调用buffer的clear（）方法，复原limit，position的位置
			buffer.clear();
			//创建解码器（charsetDecoder对象）
			CharsetDecoder decoder = charset.newDecoder();
			//使用解码器将ByteBuffer转换成CharBuffer
			CharBuffer charBuffer = decoder.decode(buffer);
			System.out.println(charBuffer);
			
			
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}

	}

}
