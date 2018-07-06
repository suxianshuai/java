package NIO;

import java.nio.charset.Charset;
import java.util.SortedMap;

public class CharsetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获取java的全部字符集
		SortedMap<String,Charset>map = Charset.availableCharsets();
		for(String alias:map.keySet())
		{
			//输入字符集的别称和对应的CharSet
			System.out.println(alias+"---->"+map.get(alias));
			
		}

	}

}
