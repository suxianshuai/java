package NIO;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class CharsetTransform {

	public static void main(String[] args) throws CharacterCodingException {
		// �����������Ķ�Ӧ��Charset
		Charset cn = Charset.forName("GBK");
		//���cn�����Ӧ�ı������ͽ�����
		CharsetEncoder cnEncoder = cn.newEncoder();
		CharsetDecoder cnDecoder = cn.newDecoder();
		CharBuffer cbuff = CharBuffer.allocate(8);
		cbuff.put('��');
		cbuff.put('��');
		cbuff.put('��');
		cbuff.flip();
		//��CharBuffer �е��ַ�����ת�����ֽ�����
		ByteBuffer bbufer = cnEncoder.encode(cbuff);
		//ѭ������ByteBuffer�е�ÿ���ֽ�
		for(int i=0;i<bbufer.capacity();i++)
		{
			System.out.println(bbufer.get(i)+" ");
		}
		System.out.println("\n"+cnDecoder.decode(bbufer));
		

	}

}
