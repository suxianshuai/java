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
			//����FileInputstream ���ļ�����������FileChannel
			FileChannel inChannel = new FileInputStream(f).getChannel();
			//���ļ����������FileChannel�����ڿ������
			FileChannel outChannel = new FileOutputStream("C:\\Users\\su\\eclipse-workspace\\java\\newFile.txt").getChannel();
			
		)
		{
			//��FileChannel��ȫ������ӳ���ByteBuffer
			MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY,0,f.length());
			//ʹ��GBK���ݼ�������������
			Charset charset = Charset.forName("GBK");
			outChannel.write(buffer);
			//�ٴε���buffer��clear������������ԭlimit��position��λ��
			buffer.clear();
			//������������charsetDecoder����
			CharsetDecoder decoder = charset.newDecoder();
			//ʹ�ý�������ByteBufferת����CharBuffer
			CharBuffer charBuffer = decoder.decode(buffer);
			System.out.println(charBuffer);
			
			
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}

	}

}
