package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.InterfaceSegregationPrinciple.ISPViolation;

public class Snake implements AnimalMoves
{
    private String name;
    private String colour;

    public Snake()
    {
        this.name = "";
        this.colour = "";
    }

    public Snake(String name, String colour)
    {
        this.name = name;
        this.colour = colour;
    }
    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public void setColour(String colour)
    {
        this.colour = colour;
    }
    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String slither()
    {
        return "A snake slithers";
    }

    @Override
    public String hop()
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        return name + "\n" + colour + "\n" + slither();
    }

}
