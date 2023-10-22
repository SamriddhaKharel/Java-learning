 class Apline{
  
  private int sideA;
  private int sideB;
  private int sideC;
  private boolean isOnLine = false; 

 
public Apline (int a,int b,int c){
sideA = a;
sideB = b;
sideC = c;
}

public int getSideA()
   {
    return sideA;
   }


public int getSideB( )
{
  return sideB;
 }


public  int getSideC( )
{
return sideC;
 
}

public void getSlop()
{
 double neg = -1;
 double slope =  (sideA*(neg))/ sideB;
 System.out.println("Line 1 :"+sideA+"x + "+sideB+"y "+sideC+" =0 ");
 System.out.println("The slope is :" + slope);

}
public void getSlope()
{
 double neg = -1;
 double slope =  (sideA*(neg))/ sideB;
 System.out.println("Line 2 :"+sideA+"x + "+sideB+"y -"+sideC+" =0 ");
 System.out.println("The slope is :" + slope);

}
public void isOnLine(int a,int b)
{
  if((sideA * a) + (sideB * b ) + sideC == 0)
  {
    isOnLine = true; 
  }
  if((sideA * a) + (sideB * b ) + sideC != 0)
        {
      isOnLine = false; 
    }
  System.out.println( "point on line ( " + a + ", " + b + " ) one line :" + isOnLine );
  
      }
}

  
                   
 