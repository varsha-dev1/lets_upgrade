// Day_4 Assignment_2

package letsUpgrade;

public class PrintOddElementsOfArray {
	
	public static void main(String[] args) {
		int[] array = new int[5];
		array[0]=23;
		array[1]=75;
		array[2]=66;
		array[3]=82;
		array[4]=31;
		System.out.println("Given array:");
		for(int i=0;i<5;i++)
		{			
				System.out.print(array[i]+"  ");							
		}
		System.out.println("\nOdd elements of this array:");
		for(int i=0;i<5;i++)
		{
			if(array[i]%2==1){
				System.out.print(array[i]+"  ");
			}				
		}
	}
}
