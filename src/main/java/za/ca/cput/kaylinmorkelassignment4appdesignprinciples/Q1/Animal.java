package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q1;

public abstract class Animal
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
        return name + " " + colour;
    }
    //public abstract String animal's action;
    public abstract String action();
}

