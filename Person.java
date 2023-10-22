public class Person
{
    // Instance Variables
    private String name;
    private String address;
    private String phone;

    // Constructor
    public Person(String n, String a, String p)
    {
        name = n;
        address = a;
        phone = p;
    }

    // Accessor Methods
    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getPhone()
    {
        return phone;
    }

    // toString method
    public String toString()
    {
        String str;
        str = "Name = " + name + "\n" + 
              "Address = " + address + "\n" + 
              "Phone = " + phone;

        return str;
    }

}
