public class line {
public static void longestStreak(String str)
{
int count  = 1;
int max = 0 ;
String d = str.substring(0,0+1);
for ( int i = 0 ;  i <  str.length(); i ++)
{ 
  for (int x  = i +1 ; x < str.length();x ++ )
  {
    if (str.substring (i, i+1).equals(str.substring (x,x+1)))
    {
      count ++;    
    }
    if (count > max)
    {
    max = count;
    d = str.substring (i,i+1);
    count = 1;  
    }
    
  }
  }
  System.out.println(d + " " + max );
}

public static void main(String[] args) 
{
longestStreak ("CAAT");
}
}
