package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.CompositeReusePrinciple.CRPCorrection;

public class Horse implements AnimalsAction
{
    private String action;
    private String name;
    private String colour;

    public Horse(String name, String colour)
    {
        this.name = name;
        this.colour = colour;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setColour(String colour) {
       this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public String action()
    {
        action = "A horse trots and neighs";
        return action;
    }
    public String toString()
    {
        return "Name: " + name + "\nColour: " + colour + "\nActions: " + action();
    }

}