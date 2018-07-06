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
			//����һ������
			RandomAccessFile raf = new RandomAccessFile(f,"rw");
			//��ȡRandomAccessFile��Ӧ��Channel
			FileChannel randomChannel =raf.getChannel())
	{
		//��Channel�е�����ӳ��ΪByteBuffer
		ByteBuffer buffer = randomChannel.map(MapMode.READ_ONLY, 0, f.length());
		randomChannel.position(f.length());
		randomChannel.write(buffer);
	}
	}  
}
