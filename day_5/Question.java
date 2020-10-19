package quiz_application;
import java.util.Scanner;
public class Question {
	Scanner sc = new Scanner(System.in);
	String question;
	String optionA,optionB,optionC,optionD;
	char userAnswer, correctAnswer;
	
	public boolean showQusetion(){
		System.out.println(question);
		System.out.println("a) "+optionA);
		System.out.println("b) "+optionB);
		System.out.println("c) "+optionC);
		System.out.println("d) "+optionD);
		System.out.println("Choose the correct option");
		userAnswer = sc.next().charAt(0);
		if(userAnswer == correctAnswer){
            return true;
        }else{
        	return false;	
        }        	
	}
}
