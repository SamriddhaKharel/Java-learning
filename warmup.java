import java.util.Scanner;
public class warmup
{
public static void main(String[] args) 
{
Scanner scan = new Scanner (System.in);
System.out.print("What is your favorite color? ");
String name = scan.nextLine();
if (name == "blue") 
{
    System.out.println(name + "Mine, too!");
}

}
}