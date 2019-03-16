package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q1;

public class Rabbit extends Animal
{
    private String action;

    public Rabbit(String nm, String col)
    {
        super(nm, col);
    }
    public String action()
    {
        action = "A rabbit hops and squeaks";
        return action;
    }
    public String toString()
    {
        return "Name: " + super.getName()+ "\nColour: " + super.getColour() + "\nActions: " + action();
    }
}
