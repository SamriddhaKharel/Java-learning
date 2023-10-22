import java.util.Scanner;
import java.lang.Math;

public class rollingDice{
public static int rollDice ()
{
int roll = (int) (Math.random()*6 +1);
return roll;

}
public static void main(String[] args){
Scanner scan = new Scanner (System.in);
System.out.println("What number do you want from 2- 12 inclusive?");
int n= scan.nextInt();

int dice1 =0;
int dice2 =0;
int sum =0 ;
int count =0;
while (sum != n)
{
dice1 = rollDice();
System.out.println("random number dice one = "+ dice1);
dice2 = rollDice();
System.out.println("random number dice two = "+ dice2);

count ++;
sum = dice1 +dice2;
System.out.println("sum = "+ sum);
System.out.println("Count="+ count);
}

}
}
