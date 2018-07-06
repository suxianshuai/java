package NIO;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class CharsetTransform {

	public static void main(String[] args) throws CharacterCodingException {
		// 创建简体中文对应的Charset
		Charset cn = Charset.forName("GBK");
		//获得cn对象对应的编码器和解码器
		CharsetEncoder cnEncoder = cn.newEncoder();
		CharsetDecoder cnDecoder = cn.newDecoder();
		CharBuffer cbuff = CharBuffer.allocate(8);
		cbuff.put('孙');
		cbuff.put('悟');
		cbuff.put('空');
		cbuff.flip();
		//将CharBuffer 中的字符序列转换成字节序列
		ByteBuffer bbufer = cnEncoder.encode(cbuff);
		//循环访问ByteBuffer中的每个字节
		for(int i=0;i<bbufer.capacity();i++)
		{
			System.out.println(bbufer.get(i)+" ");
		}
		System.out.println("\n"+cnDecoder.decode(bbufer));
		

	}

}
