package test;
import java.util.Scanner;


public class test {
	public static void main(String[] args) {
		java.util.Scanner input = new Scanner(System.in);
		
		
		System.out.print("Type Number of passing attempts: ");
		double ATT = input.nextDouble();
		
		System.out.print("Type Number of completions: ");
		double COMP = input.nextDouble();
		
		System.out.print("Type Passing yards: ");
		double YDS = input.nextDouble();
		
		System.out.print("Type Touchdown passes: ");
		double TD = input.nextDouble();
		
		System.out.print("Type Interceptions: ");
		double INT = input.nextDouble();
		
		double a = ((COMP/ATT) -0.3) *5;
		
		double b = ((YDS/ATT)-3) * 0.25;
		
		double c = (TD/ATT) * 20;
		
		double d = 2.375 - ((INT/ATT)*25);
		
		double QBrating = (a+b+c+d) *100 / 6;
		
		System.out.println("the QB rating is "+ QBrating);
		
		
	}

}
