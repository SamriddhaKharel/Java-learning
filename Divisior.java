public class Divisior
{
public static boolean isSelfDivisor(int number) // part A
{
int currNumber = number;
int digit = 0;
while (currNumber > 0)
{
digit = currNumber % 10;
if (digit == 0)
return false;
if (number % digit != 0) 
return false;
currNumber = currNumber / 10;
}
return true;
}
public static int[] firstNumSelfDivisors(int start, int num) // part B
{
int[] y = new int[num];
int element = 0;
while (element < num) 
{
if (isSelfDivisor(start)) {
y[element] = start;
element++;
}
start++;
}
return y;
}
public static void main (String[] args)
{
System.out.println("4: " + isSelfDivisor(4));
System.out.println("7: " + isSelfDivisor(7));
System.out.println("19: " + isSelfDivisor(19));
System.out.println("2: " + isSelfDivisor(2));
System.out.println("Self divisors for firstNumSelfDivisors(10, 3):");
for (int n : firstNumSelfDivisors(10, 3))
System.out.print(n+ " ");

}
}