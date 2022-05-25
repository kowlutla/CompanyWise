package sockspair;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SocksPair {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String s=sc.nextLine();
		
		boolean ispair=checkPairLetter(s);
		System.out.println(ispair);

	}

	private static boolean checkPairLetter(String s) {
		
		Map<Character,Integer>map=new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			if(map.get(s.charAt(i))!=null)
			{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else
			{
				map.put(s.charAt(i), 1);
			}
		}
		
		Iterator<Character>iter=map.keySet().iterator();
		while(iter.hasNext())
		{
			char key=iter.next();
			if(map.get(key)%2!=0)
			{
				return false;
			}
		}
		
		return true;
	}

}
