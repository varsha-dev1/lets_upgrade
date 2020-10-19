package letsUpgrade;
import java.util.Scanner;
public class ArrayWithUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int sum=0;
		System.out.println("Enter elements of array: ");
		for(int i=0;i<5;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			sum=sum+array[i];
		}
		System.out.println("Total of all elements of array is: "+sum);


	}

}
