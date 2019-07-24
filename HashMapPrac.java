import java.util.*;
class HashMapPrac
{
	public static void main(String...d) throws Exception
	{
		//Map m= new Map();
		HashMap hm= new HashMap();
		hm.put(111,"abc");
		hm.put(112,"qwe");
		hm.put(113,"uio");
		hm.put(114,"lkj");
		//headMap(113);
		System.out.println(hm);
		System.out.println(hm.put(113,"inkijh"));
		System.out.println(hm);
		Set s=hm.keySet();
		System.out.println(s);
		Collection c=hm.values();
		System.out.println(c);
		Set es=hm.entrySet();
		System.out.println(es);
		Iterator it=es.iterator();
		while(it.hasNext())
		{
			Map.Entry m1= (Map.Entry)it.next();
			System.out.println(m1.getKey()+ ". . . "+m1.getValue());
			if(m1.getKey().equals(112))
			{
				m1.setValue("qwerty");
			}
		}
		System.out.println(hm);
		hm=null;
		System.gc();
		Thread.sleep(500);
		System.out.println(hm);
	}
}