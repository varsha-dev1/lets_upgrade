//Day_3 Assignment_2

package letsUpgrade;
import java.util.Scanner;
public class EmployeeTax {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name ");
		String name = sc.nextLine();
		
		System.out.println("Birth year ");
		int birthYear = sc.nextInt();
		
		System.out.println("Birth month ");
		int birthMonth = sc.nextInt();
		
		System.out.println("Birth date ");
		int birthDate = sc.nextInt();
		
		System.out.println("Salary per month ");
		int monthlySalary = sc.nextInt();
		
		int annualSalary = monthlySalary*12;
		float taxAmount = tax(annualSalary);
		int age = 2020-birthYear;
		display(name,age,annualSalary,taxAmount);
		sc.close();

	}
	public static float tax(int salaryPerAnnum){
		float taxPerAnnum;
		if(salaryPerAnnum>500000){
			taxPerAnnum = salaryPerAnnum*0.2f;
		}else if(salaryPerAnnum>400000){
			taxPerAnnum = salaryPerAnnum*0.15f;
		}else if(salaryPerAnnum>300000){
			taxPerAnnum = salaryPerAnnum*0.1f;
		}else if(salaryPerAnnum>200000){
			taxPerAnnum = salaryPerAnnum*0.05f;
		}else{
			taxPerAnnum=0;
		}
		return taxPerAnnum;
	}
	public static void display(String name, int age, int annualSalary, float taxAmount){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Annual Salary: "+annualSalary);
		System.out.println("Tax Amount: "+taxAmount);
	}	
}
