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
				//�����ļ���
				FileInputStream fis = new FileInputStream("F:\\copy\\eclipse-workspace\\java\\src\\NIO\\ReadFile.java");
				//����һ��FileChannel����
				FileChannel fcin = fis.getChannel())
		{
			//����һ��ByteBuffer �ظ�ȡˮ
			ByteBuffer bbuffer = ByteBuffer.allocate(256);
			//��FileChannel�е����ݷ���ByteBuffer��
			while(fcin.read(bbuffer)!=-1)
			{
				//�����հ���
				bbuffer.flip();
				//����CharSet����
				Charset charset = Charset.forName("GBK");
				//��������������
				CharsetDecoder decoder = charset.newDecoder();
				//��ByteBuffer������ת��
				CharBuffer cbuff = decoder.decode(bbuffer);
				System.out.println(cbuff);
				bbuffer.clear();
			}
		}

	}

}
