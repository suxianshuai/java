package NIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class FileLockTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		try(//ʹ��FileOutStream��ȡFileChannel
				FileChannel channel = new FileOutputStream("F:\\copy\\eclipse-workspace\\java\\src\\NIO\\poem.txt").getChannel();
		  )
		
		{
			//�÷�������ʽ���ļ�����
			FileLock lock = channel.tryLock();
			//������ͣ10��
			Thread.sleep(10000);
			//�ͷ���
			lock.release();
		}

	}

}
