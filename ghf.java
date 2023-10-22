public class ghf
{  
public static void doStuff (int[] a, int n)
{
if ( n >= 0 || n < a.length)
{
for (int i = n; i < a.length; i++)
{
a[i] = a[i] / 2;
}
}
}
 


public static void main(String[] args)
{
int[] nums = {1, 2, 7, 3, 5};  
doStuff (nums,7);
}
}




/* public static String mashup(String str, int[] arr)
{
  String result = "";
  for (int x : arr)
  {
    result = result + str.substring(0, x);
  }
  return result;
}

public static void main(String[] args) 
{
int[] nums = {1, 5, 3};
String word = "program";
System.out.println(mashup(word, nums)); */