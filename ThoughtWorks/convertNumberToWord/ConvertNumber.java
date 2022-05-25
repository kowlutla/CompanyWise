/**
  For example :

	Input   :   123456789
	  
	Output: One hundred twenty three million four hundred fifty six thousand seven hundred eighty nine
 */
package convertNumberToWord;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class ConvertNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		long n=sc.nextLong();
		String num_word=convert(n);
		System.out.println("Number: "+n);
		System.out.println("Number in words: "+num_word);
		sc.close();

	}
	
	
	public static final String units[]= {"","One ","Two","Three","Four","Five","Six","Seven","Eight","Nine"
			,"Ten","Eleven","Twelve","Thirteen","Fourteen","FIfteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	
	public static final String tens[]= {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	
	private static String convert(long n)
	{
		if(n<0)
		{
			return "Minus "+convert(-n);
		}
		
		if(n==0)
		{
			return "Zero"; 
		}
		if(n<20)
		{
			return units[(int) n];
		}
		if(n<100)
		{
			return tens[(int) (n/10)]+((n%10!=0)?" ":"")+units[(int) (n%10)];
		}
		if(n<1000)
		{
			return units[(int) (n/100)]+" Hundred "+((n%100!=0)?" ":"")+convert(n%100);
		}
		if(n<100000)
		{
			return convert(n/1000)+" Thousand "+((n%1000!=0)?" ":"")+convert(n%1000);
		}
		if(n<10000000)
		{
			return convert(n/100000)+" Lakh "+((n%100000!=0)?" ":"")+convert(n%100000);
		}
		return convert(n/10000000)+" crore "+((n%10000000!=0)?" ":"")+convert(n%10000000);
	}

}
