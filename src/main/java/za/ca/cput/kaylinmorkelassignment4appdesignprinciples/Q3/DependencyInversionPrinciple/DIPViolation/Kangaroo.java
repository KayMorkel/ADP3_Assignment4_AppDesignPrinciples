package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.DependencyInversionPrinciple.DIPViolation;

public class Kangaroo
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
    public String action()
    {
        return "A Kangaroo hops";
    }
}

