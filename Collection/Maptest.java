package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Maptest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		//�ɶԷ���key-valueֵ
		map.put("���java����", 109);
		map.put("���iOS����",10);
		map.put("���Ajax����",79);
		map.put("���java EE��ҵӦ��ʵ��", 99);
		System.out.println(map.put("���iOS����",99));
		System.out.println(map);
		System.out.println(map.containsKey("���iOS����"));
		System.out.println(map.containsValue(99));
		for(Object key:map.keySet())
		{
			System.out.println(key+"--->"+map.get(key));
		}
		for(Entry e:map.entrySet())
		{
			System.out.println(e.getKey()+"--->"+e.getValue());
		}
		Iterator it=map.entrySet().iterator();
		while(it.hasNext())
		{
			Entry e = (Entry) it.next();
			System.out.println(e.getKey()+"--->"+e.getValue());
		}
	}

}
