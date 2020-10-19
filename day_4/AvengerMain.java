//Day_4 Assignment_1 (part-2)

package letsUpgrade;
import java.util.Scanner;
public class AvengerMain {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Avenger[] avengers = new Avenger[5];
		
		for(int i = 0; i < 5; i++)
		{
			avengers[i] = new Avenger();
			avengers[i].getDetails();
		}
		for(int i = 0; i < 5; i++)
		{
			
			avengers[i].displayDetails();
		}
		sc.close();		
	}
}
