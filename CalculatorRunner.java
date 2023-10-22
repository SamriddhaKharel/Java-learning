import java.util.Scanner;
public class CalculatorRunner {
public static void main(String[]args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter your problem : ");
String x = scan.nextLine();
Calculator problem = new Calculator(x);
   problem.myProblem();    
}
}



