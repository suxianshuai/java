package NIO;

import java.nio.charset.Charset;
import java.util.SortedMap;

public class CharsetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ȡjava��ȫ���ַ���
		SortedMap<String,Charset>map = Charset.availableCharsets();
		for(String alias:map.keySet())
		{
			//�����ַ����ı�ƺͶ�Ӧ��CharSet
			System.out.println(alias+"---->"+map.get(alias));
			
		}

	}

}
