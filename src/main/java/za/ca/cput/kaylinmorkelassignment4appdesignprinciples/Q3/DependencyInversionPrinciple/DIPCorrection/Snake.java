package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.DependencyInversionPrinciple.DIPCorrection;

public class Snake implements ActionOfAnimal
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String action() {
        return "A Snake slithers";
    }
}
