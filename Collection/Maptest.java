package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Maptest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		//成对放入key-value值
		map.put("疯狂java讲义", 109);
		map.put("疯狂iOS讲义",10);
		map.put("疯狂Ajax讲义",79);
		map.put("疯狂java EE企业应用实践", 99);
		System.out.println(map.put("疯狂iOS讲义",99));
		System.out.println(map);
		System.out.println(map.containsKey("疯狂iOS讲义"));
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
