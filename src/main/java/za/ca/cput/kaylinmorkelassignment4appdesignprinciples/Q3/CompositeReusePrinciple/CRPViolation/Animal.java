package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.CompositeReusePrinciple.CRPViolation;

public class Animal
{
    private String name;
    //private int age;
    //private String action;
    private String colour;
    //DEFAULT CONSTRUCTOR
    public Animal()
    {
        name = "";
        colour = "";

    }
    //PARAMETERISED CONSTRUCTOR
    public Animal(String nm, String col)
    {
        name = nm;
        //age = a;
        //action = act;
        colour = col;
    }
    //SETTERS
    public void setName(String nme)
    {
        this.name = nme;
    }
    public void setColour(String colr)
    {
        this.colour = colr;
    }
    //GETTERS
    public String getName()
    {
        return name;
    }
    public String getColour()
    {
        return colour;
    }
    //TO STRING METHOD
    public String toString()
    {
        return "Name: " + name+ "\nColour: " + colour + "\nActions: " + action();
    }
    //public abstract String animal's action;
    public String action()
    {
        return "This animal can jump, slither, etc.";
    };
}

