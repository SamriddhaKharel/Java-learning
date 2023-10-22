public class Student extends Person
{
    // Instance Variables
    private String ID;
    private int classification;

    // Constructor
    public Student(String n, String a, String p, String id, int c)
    {
       super(n, a, p);
       ID = id;
       classification = c;  
    }

    // Accessor methods
    public String getID()
    {
        return ID;
    }

    public int getClassification()
    {
        return classification;
    }

    // toString method
    public String toString()
    {
        String str;
        str = super.toString() + "\n" +
              "ID Number = " + ID + "\n" +
              "classification = " + classification;

        return str; 
    }
    

public static void main(String[] args) 
{
Student p1 = new Student ("Samriddha", "7514 Palmetto drive "," 682", "5416953 id" ,914);

System.out.println(p1);
  
}
}


