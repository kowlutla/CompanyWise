public class Level3 {

	public static void main(String[] args) {
		
		String sentence="my name is kowlutla";
		String array[]=sentence.split(" ");
		int px=0;
		String temp="";
		for(String s:array)
		{
			if((s.length()*5+px)>80)
			{
				System.out.println(temp);
				temp="";
				px=0;
			}
			else
			{
				temp=temp+s;
				px=px+(s.length()*5);
				if(px>78)
				{
					System.out.println(temp);
					px=0;
					temp="";
				}
				else
				{
					px=px+2;
					temp=temp+" ";
				}
			}
		}
		
		if(px<78) {
			
			px=px+2;
			if(px+array[array.length-1].length()*5<80)
			{
				System.out.println(temp+" "+array[array.length-1]);
			}
			else
			{
				System.out.println(array[array.length-1]);
			}
		}
		else
		{
			System.out.println(array[array.length-1]);
		}
		
	}

	
	//screen is 80px, for one charcter 5px for space=2px

}
