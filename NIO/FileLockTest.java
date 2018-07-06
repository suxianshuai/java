package NIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class FileLockTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		try(//使用FileOutStream获取FileChannel
				FileChannel channel = new FileOutputStream("F:\\copy\\eclipse-workspace\\java\\src\\NIO\\poem.txt").getChannel();
		  )
		
		{
			//用非阻塞方式对文件加锁
			FileLock lock = channel.tryLock();
			//程序暂停10秒
			Thread.sleep(10000);
			//释放锁
			lock.release();
		}

	}

}
