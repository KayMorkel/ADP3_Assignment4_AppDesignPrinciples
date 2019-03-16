package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.CompositeReusePrinciple.CRPCorrection;

public class Rabbit implements AnimalsAction
{
    private String action;
    private String name;
    private String colour;

    public Rabbit(String name, String colour)
    {
        this.name = name;
        this.colour = colour;
    }

    public void setName(String name) {
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
        action = "A rabbit hops and squeaks";
        return action;
    }
    public String toString()
    {

        return "Name: " + name + "\nColour: " + colour + "\nActions: " + action();
    }
}
