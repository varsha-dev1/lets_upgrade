package quiz_application;
import java.util.Scanner;
public class Player {
	Scanner sc = new Scanner(System.in);
	String playerName; 
	int score=0;
	
	public void getDetails(){
		System.out.print("Enter player name: ");
		playerName = sc.next();
	}
}
 