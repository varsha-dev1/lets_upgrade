// Day_3 Assignment_1

import java.util.Scanner;
public class PercentAndGrade {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int total = 0;
		System.out.println("Enter marks of all five subjects(out of 100):");
		for(int i=1; i<=5; i++){
			int marks = sc.nextInt();
			total = total + marks;
		}
		float percentage = total/5;
		if(percentage>=90){
			System.out.println("Grade: A and Percentage: "+percentage);
		}else if(percentage>=75 && percentage<90){
			System.out.println("Grade: B and Percentage: "+percentage);
		}else if(percentage>=60 && percentage<75){
			System.out.println("Grade: C and Percentage: "+percentage);
		}else if(percentage>=50 && percentage<60){
			System.out.println("Grade: D and Percentage: "+percentage);
		}else{
			System.out.println("No reward and Percentage is:"+percentage);
		}			
	}
}
