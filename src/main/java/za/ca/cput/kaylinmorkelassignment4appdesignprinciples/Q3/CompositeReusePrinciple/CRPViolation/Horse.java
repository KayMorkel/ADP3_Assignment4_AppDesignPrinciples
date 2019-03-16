package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.CompositeReusePrinciple.CRPViolation;

public class Horse extends Animal
{
    private String action;

    public Horse(String nm, String col)
    {
        super(nm, col);
    }
    @Override
    public String action()
    {
        action = "A horse trots and neighs";
        return action;
    }
    public String toString()
    {
        return "Name: " + super.getName()+ "\nColour: " + super.getColour() + "\nActions: " + action();
    }
}
