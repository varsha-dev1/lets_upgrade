//Day_2 Assignment

public class Employee {
	String name = "Siya";
	int age = 20;
	String city = "Janakpuri";
	
	public void display()
	{
		System.out.println("The name is "+name);
		System.out.println("The age is "+age);
		System.out.println("The city is "+city);
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.display();
		emp2.display();
	}

}
