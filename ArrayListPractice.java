import java.util.*;     // needed for ArrayList
import java.util.ArrayList;

public class ArrayListPractice
{
Scanner scan = new Scanner(System.in);

public static void Method1()
{
ArrayList <Integer> holder = new ArrayList <Integer>();

holder.add(10);
holder.add(20);
holder.add(30);
holder.add(40);
holder.add(50);
holder.add(60);
holder.add(70);
holder.add(80);
holder.add(90);
holder.add(100);

for(int i = 0; i < holder.size() ; i++) 
{
System.out.println(holder.get(i));
}
System.out.println(" ");


System.out.println("Now using for Each loop");
System.out.println(" ");

for (int s : holder)
{
System.out.println(s); 
}
}  

public static void Method2()
{

ArrayList <String> holder2 = new ArrayList <String>();


Scanner str = new Scanner(System.in);

while (true) 
{
if(holder2.contains("exit"))
{
holder2.remove("exit");
break;

}
System.out.println("Enter words - type exit when finished.");
holder2.add(str.next());

}
for(int i = 0; i < holder2.size() ; i++) 
{
System.out.println(holder2.get(i));
}
System.out.println(" ");

System.out.println("Now using for Each loop");
System.out.println(" ");

for (String hard : holder2)
{
System.out.println(hard); 
}
}
 

public static void main(String[] args)
{

System.out.println("Method 1");

System.out.println("--------");
System.out.println();
Method1();
System.out.println();

System.out.println("Method 2");
System.out.println("--------");
System.out.println();
Method2();      
}

 

}