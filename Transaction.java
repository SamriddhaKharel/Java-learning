public class Transaction
{
    public static final double TAX_RATE = 0.0825;

    private String myDescription;  
    private int myNumItems;        
    private double myItemCost;     
    

    public Transaction(String description, int numItems, double itemCost)
    {
        myDescription = description;
        myNumItems = numItems;
        myItemCost = itemCost;
    }
    

    public String getDescription()
    {
        return myDescription;
    }
    
    public int getNumItems()
    {
        return myNumItems;
    }
    
    public double getItemCost()
    {
        return myItemCost;
    }
    
    public double getTotal()
    {
        double cost = myNumItems * myItemCost;
        double tax = cost * TAX_RATE;
        return cost + tax;
    }
    
    public String toString()
    {
        String str = "";
        str = "Description      : " + myDescription + "\n" +
              "Quantity         : " + myNumItems  + "\n" +
              "Cost             : " + myItemCost  + "\n" +
              "Total Cost       : " + getTotal();
        return str;
    }
}