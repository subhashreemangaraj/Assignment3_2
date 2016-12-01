import java.io.BufferedReader;
import java.util.Scanner;

public class Assignment3_2 {
	
	public static void main(String[] args) {
		
		String s1;
		String s2;
		boolean b;
		
		Scanner s = new Scanner(System.in);//Calling class to take input
		
		System.out.println("Enter the 1st string");//1st string
		s1 = s.nextLine();
		
		System.out.println("Enter the 2nd string");//2nd string
		s2 = s.nextLine();
		
		Assignment3_2 c = new Assignment3_2();//creating object
		
		b = c.compare(s1,s2);//calling compare method
		
		System.out.println("Result: "+b);
		
	}
	
	public boolean compare(String s1, String s2){//definition of the method
		
		boolean b;
		
		b = s1.equals(s2);//comparing
		
		return b;//returning value
		
	}

}
