import java.util.Scanner;
public class  Calculator {
static void myProblem (String a)
{
  System.out.println("Fraction is :"+a); 
}
static void addNum (int e, int f)
{
System.out.println("Addition total = "+ e+"/"+f);
}
static void subNum (int x, int y)
{
System.out.println("Subtraction total = "+ x+"/"+y);
}
static void mulNum (int g, int h)
{
System.out.println("Multiply total = "+ g+"/"+h);
}
static void divNum (int i,int j)
{
System.out.println("Division total = "+ i+"/"+j);
}

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
System.out.println("what operation do you want to perform ? (add, subtarct, multiply, divide)"); 
String str = scan.next();

  
  
System.out.println("Enter your problem : ");
String x = scan.nextLine();

myProblem(x);  

int solve;
int solve1;
int solve2;
int solve3;
int  numerator ;
int denominator;
int subnum;
int subnum1;
int subdenom;
int subdenom1;
int fram ;
int fran;
int dnum;
int ddom;
//int operator;

solve  =Integer.parseInt( x.substring(0,1));  
solve1 =Integer.parseInt( x.substring(2,3));
solve2 =Integer.parseInt( x.substring(4,5));  
solve3 =Integer.parseInt( x.substring(6));  


numerator = solve *solve3+ solve1 *solve2; 
denominator =solve1 * solve3;

if(str == "add")
{
  addNum(numerator,denominator);
}


subnum= solve1*solve2;
subdenom =solve3 * solve;
subnum1 =  subdenom - subnum;
subdenom1 = solve1 * solve3;
if(str == "subtract")
{
subNum(subnum1,subdenom1); 
}

  
fram = solve*solve2;
fran = solve1*solve3;

dnum = solve*solve3;
ddom = solve1*solve2; 

if(str == "multiply")
{
mulNum(fram, fran);
}

if(str == "divide")
{
divNum(dnum,ddom);
}
}

}
