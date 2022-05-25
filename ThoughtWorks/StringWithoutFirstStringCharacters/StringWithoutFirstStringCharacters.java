package StringWithoutFirstStringCharacters;

import java.util.Scanner;

public class StringWithoutFirstStringCharacters {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String With two words: ");
		String s=sc.nextLine();
		String words[]=s.split(" ");
		String first=words[0];
		String second=words[1];
		System.out.println("First: "+first);
		System.out.println("Second: "+second);
		for(int i=0;i<second.length();i++)
		{
			first=first.replaceAll(""+second.charAt(i), "");
		}
		
		System.out.println("First without second Word: "+first);

	}

}


//String1: skyisblue
//String2: eyes
//output: kiblu




