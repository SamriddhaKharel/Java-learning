import java.util.Scanner;
public class test 
{
public static void selectionSort(int[] elements)

{

for (int j = 0; j < elements.length - 1; j++)

{

int minIndex = j;

for (int k = j + 1; k < elements.length; k++)

{

if (elements[k] < elements[minIndex])

{

minIndex = k;

}

}

if (j != minIndex)

{

int temp = elements[j];

elements[j] = elements[minIndex];

elements[minIndex] = temp;    // Line 19

}

}

}
public static void main(String[] args)
{
int[] arr = {9, 8, 7, 6, 5};

//selectionSort(arr);
System.out.println(selectionSort(arr));
}
}
/*public static void main(String[] args)
{
  int count1 =0;
  int count2 = 0;
int[] tests = new int[20];   
for (int i = 0; i < tests.length; i++)
{
tests[i] = (int)(Math.random() * 200) + -100;
}
System.out.println("All random number");
for (int i = 0; i < tests.length; i++)
{
  System.out.println(tests[i] + " "  );
}
System.out.println("Positive numbers");
for (int i = 0; i < tests.length; i++)
{
if (tests[i] > 0)
  count1 ++;
System.out.println( tests [i]);
}
System.out.println("Total positve Num:" + count1);
System.out.println("Negative numbers");
for (int i = 0; i < tests.length; i++)
{
if (tests[i] < 0)
 count2 ++;
System.out.println(tests [i]);
}
System.out.println("Total negative  Num:" + count2);
}
}

*/



/*
import java.util.Scanner;
public class test 
{

public static boolean hasRepeat (String str) {
  for (int i = 0; i < str.length() - 1; i++) 
  {
    if(str.substring(i, i +1).equals(str.substring(i +1, i + 2)))
    {
      return true; 
      
    } 
    
  } return false; 
  
} 
  


public static int integer (int a, int b)
{
  return a + b;
}
public static void main(String[] args)
  {


Scanner scan = new Scanner (System.in);
String s = scan.nextLine();
hasRepeat(s);
  }




}

*/