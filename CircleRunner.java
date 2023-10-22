import java.util.Scanner;

public class CircleRunner{
public static void main(String[] args){
Scanner scan = new Scanner (System.in);
    System.out.println("Enter radius:");
    double n = scan.nextDouble();
    System.out.println("Enter xcenter:");
    double m = scan.nextDouble();
    System.out.println("Enter ycenter:");
    double f = scan.nextDouble();

Circle a = new Circle (n,m,f);
a.getRadius();
a.setRadius(25);
a.toString();  
System.out.println("\n"+a);
}
}