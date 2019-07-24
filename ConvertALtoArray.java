import java.util.*;
public class ConvertALtoArray
{
	public static void main(String...d)
	{
		ArrayList<String> al= new ArrayList();
		al.add("Hindi");
		al.add("English");
		al.add("Maths");
		al.add("Science");
		al.add("Punjabi");
		System.out.println(al);
		
		String str[]= new String[al.size()];
		for(int i=0;i<al.size();i++)
		{
			str[i]=al.get(i);
		}
		for(String k:str)
		{
			System.out.println(k);
		}
	}
}