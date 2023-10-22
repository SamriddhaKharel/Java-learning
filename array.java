public class array 
{
public static void main(String[] args) 
{
int[] ar1 = new int[5];
for(int i = 0; i <  ar1.length; i++) 
{
ar1[i] = (int)(Math.random() * 20);
System.out.print(ar1[i] + "  ");
}
int sum = ar1[0]+ar1[1]+ar1[2]+ar1[3]+ar1[4];
System.out.println();

System.out.println("total sum: " + sum);

int smallest = ar1[0];
int largest = ar1[0];
for (int i = 0 ; i < ar1.length;i++)
{
if (ar1[i] > largest)
{
largest = ar1[i];
}
}
System.out.println("largest value is:" + largest);
for (int i = 0 ; i < ar1.length;i++)
{
if (ar1[i] < smallest)
{
smallest = ar1[i];
}
}
System.out.println("Smallest value is:" + smallest);
}
}