package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.InterfaceSegregationPrinciple.ISPCorrection;

public class Kangaroo implements AnimalBasicDeets, HopAnimal
{
    private String name;
    private String colour;

    public Kangaroo()
    {
        this.name = "";
        this.colour = "";
    }

    public Kangaroo(String name, String colour)
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
    public String hop() {
        return "A kangaroo hops";
    }
    public String toString()
    {
        return name + "\n" + colour + "\n" + hop();
    }
}
