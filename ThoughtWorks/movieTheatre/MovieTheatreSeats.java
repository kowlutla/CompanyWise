/**
 *Problem Statement: – In a movie theatre 2 shows are running. 
 *You are given available seat of both show.There are some groups who want to 
 *book the tickets so first ask the show no. and then check whether seats are 
 *available or not if available then book their seats else ask them to enter seats 
 *again.After each successful booking print total available seats and total booked seats.
 *
 	Show 1:
	Available seat:- A1, A2, A3, A4, A5, A6, A9
	
	Show 2:
	Available seat:- A1, A2, A4, A5, A6, B1, B3, B4, B5, B6, B7
	
	Group1: - 
	Enter show no:- 1
	Enter seats:- A1, A4
	
	Print:- “Successfully booked”
	Available seat:- A2, A3, A5, A6, A9
	Booked Seat:- A1, A4
	
	Group2:- 
	Enter show no:- 1
	Enter seats:- A1, A3
	
	Print : - seat A1 not available please try again.
 *
 *
 */
package movieTheatre;
import java.util.*;
import java.io.*;
/**
 * @author apiiit-rkv
 *
 */
public class MovieTheatreSeats {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//show1 available seats
		TreeSet<String>show1_ava=new TreeSet<String>();
		show1_ava.add("A1");
		show1_ava.add("A2");
		show1_ava.add("A3");
		show1_ava.add("A4");
		show1_ava.add("A5");
		show1_ava.add("A6");
//		show1_ava.add("A7");
//		show1_ava.add("A8");
		show1_ava.add("A9");
		
		//show2 available seats
		
		TreeSet<String>show2_ava=new TreeSet<String>();
		show2_ava.add("A1");
		show2_ava.add("A2");
		show2_ava.add("A4");
		show2_ava.add("A5");
		show2_ava.add("A6");
		show2_ava.add("B1");
		show2_ava.add("B3");
		show2_ava.add("B4");
		show2_ava.add("B5");
		show2_ava.add("B6");
		show2_ava.add("B7");
		
	
		System.out.println("Enter no of Groups: ");
		int group_count=Integer.parseInt(br.readLine());
		System.out.println("Show1:\nAvailable Seats: "+show1_ava);
		System.out.println("Show2:\nAvailable Seats: "+show2_ava);
	
		
		int start=1;
		while(start<=group_count)
		{
			boolean is_available=false;
			while(true)
			{
				System.out.println("Gropu: "+start+" : ");
				System.out.println("Enter Show number: ");
				int show_num=Integer.parseInt(br.readLine());
				System.out.println("Enter No of seats: ");
				int seatNumbers=Integer.parseInt(br.readLine());
				System.out.println("Enter Seats: ");
				HashSet<String>seats=new HashSet<String>(seatNumbers);
				for(int i=0;i<seatNumbers;i++)
				{
					seats.add(br.readLine());
				}
				
				switch(show_num)
				{
					case 1:
						is_available=checkAvailbility(show1_ava,seats);
						break;
					case 2:
						is_available=checkAvailbility(show2_ava,seats);
						break;
					default:
						System.out.println("Invalid show ");
						break;
				}
				
				if(is_available)
				{
					System.out.println("Successfully Booked ");
					System.out.println("Available Seats: ");
					switch(show_num)
					{
						case 1:
							System.out.println(show1_ava);
							break;
						case 2:
							System.out.println(show2_ava);
							break;
					}
					start++;
					break;
				}
			}
		}
	}

	private static boolean checkAvailbility(TreeSet<String> show_ava, HashSet<String>seats) {
		
		if(show_ava.containsAll(seats))
		{
			show_ava.removeAll(seats);
			return true;
		}
		else
		{
			for(String s:seats)
			{
				if(!show_ava.contains(s))
				{
					System.out.print(s+" ");
				}
			}
	}
		return false;

}}
