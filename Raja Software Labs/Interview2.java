import java.util.Arrays;

public class Interview2 {
	public static void main(String[] args) {

		minimum(56);
	}

	public static void minimum(int amount) {

		if (amount % 5 == 0) {
			System.out.println(amount / 5 + " coins of 5s");
		}
		else if (amount % 2 == 0) {
			if(amount%5==1)
			{
				System.out.println(
						((amount / 5) - 1) + " coins of 5s and " + (amount - ((amount / 5) - 1) * 5) / 2 + " coins of 2s");
			}
			else
			{
				System.out.println(amount / 5 + " coins of 5s and " + ((amount) % 5) / 2 + " coin of 2s");
			}
		} 
		else {
			System.out.println(
					((amount / 5) - 1) + " coins of 5s and " + (amount - ((amount / 5) - 1) * 5) / 2 + " coins of 2s");
		}

	}

}
