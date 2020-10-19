//Day_4 Assignment_1

package letsUpgrade;
import java.util.Scanner;
public class Avenger {	
	
	Scanner sc = new Scanner(System.in);
	private String name;
	private int age;
	private String power;
	private String weapon;
	private String planet;
	
	public void getDetails(){
		System.out.println("Enter Avenger's name:");
		name=sc.nextLine();
		System.out.println("Age:");
		age=sc.nextInt();
		System.out.println("Power:");
		power=sc.next();
		System.out.println("Weapon:");
		weapon=sc.next();
		System.out.println("Planet:");
		planet=sc.next();
	}
	
	public void displayDetails(){
		System.out.println("Avenger's name is: "+name+" , Age: "+age+" , Power: "+power+" , Weapon: "+weapon+" , Planet: "+planet);		
				
	}	

}
