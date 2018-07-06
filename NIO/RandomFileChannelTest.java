package NIO;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

public class RandomFileChannelTest {
	public static void main(String[] args)throws IOException
	{
	File f = new File("a.txt");
	try(
			//创建一个对象
			RandomAccessFile raf = new RandomAccessFile(f,"rw");
			//获取RandomAccessFile对应的Channel
			FileChannel randomChannel =raf.getChannel())
	{
		//将Channel中的数据映射为ByteBuffer
		ByteBuffer buffer = randomChannel.map(MapMode.READ_ONLY, 0, f.length());
		randomChannel.position(f.length());
		randomChannel.write(buffer);
	}
	}  
}
