package encryptLetters;

import java.util.Scanner;

public class EncryptString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=sc.nextLine();
		String temp="";
		System.out.print("Enter number to encrypt: ");
		int n=sc.nextInt();
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isLowerCase(c))
			{
				char k=(char)((int)(c+n-97)%26+97);
				temp=temp+k;
			}
			else if(Character.isUpperCase(c))
			{
				char k=(char)((int)(c+n-65)%26+65);
				temp=temp+(char)k;
			}
			else
			{
				temp=temp+s.charAt(i);
			}
		}
		System.out.println(temp);

	}

}
