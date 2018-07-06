package NIO;

import java.nio.CharBuffer;

public class BufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharBuffer buff = CharBuffer.allocate(8);
		System.out.println("capacity"+buff.capacity());
		System.out.println("limit:"+buff.limit());
		System.out.println("position"+buff.position());
		buff.put("a");
		buff.put("b");
		buff.put("c");
		System.out.println("position"+buff.position()+"capacity"+buff.capacity()+"limit"+buff.limit());
		buff.flip();
		System.out.println("position"+buff.position()+"capacity"+buff.capacity()+"limit"+buff.limit());
		buff.clear();
		System.out.println("position"+buff.position()+"capacity"+buff.capacity()+"limit"+buff.limit());
		

	}

}
