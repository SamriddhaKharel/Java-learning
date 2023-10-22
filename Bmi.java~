import java.util.Scanner;
import java.lang.Math;

public class  Bmi {


public static double bmi (double height, double weight)
{ 

 double bmi1 = (weight/Math.pow (height, 2))*703;
 return bmi1;
 
}
public static String weightClass(double height, double weight) 
{
  
 String cat = "";
 double check = bmi(height,weight);

  if (check <= 18.5)
  {
  cat=("Underweight");
  }
  
  if (check >= 25.0 && check <= 30)
  {
   cat = ("Overweight"); 
  }
  if (check >= 30.0)
  {
   cat = ("Obese"); 
  }
   if (check >= 18.5 && check <= 25)
  {
   cat = ("Normal"); 
  }
  return cat;
}


public static void main(String[] args) {
Scanner scan = new Scanner (System.in);

System.out.println("Please input height in inches ?");
double a = scan.nextDouble();
System.out.println("Please input weight in pound ?");
double b = scan.nextDouble();
String result = weightClass(a,b);


 
System.out.println("Height (in inches): "+a); 
System.out.println("Weight (in pound): "+b); 
System.out.println("BMI : " + bmi(a,b));
System.out.println("The person is "+ result); 
}
}