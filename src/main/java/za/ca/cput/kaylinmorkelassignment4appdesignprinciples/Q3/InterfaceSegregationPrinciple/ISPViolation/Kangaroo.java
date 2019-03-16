package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.InterfaceSegregationPrinciple.ISPViolation;

public class Kangaroo implements AnimalMoves
{
    private String nam;
    private String col;

    public Kangaroo()
    {
        this.nam = "";
        this.col = "";
    }

    public Kangaroo(String nam, String col)
    {
        this.nam = nam;
        this.col = col;
    }

    @Override
    public void setName(String name)
    {
        nam = name;
    }

    @Override
    public void setColour(String colour)
    {
        col = colour;
    }

    public String getNam() {
        return nam;
    }

    public String getCol() {
        return col;
    }

    @Override
    public String slither()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public String hop()
    {
        return "A Kangaroo hops";
    }

    public String toString()
    {
        return nam + "\n" + col + "\n" + hop();
    }
}
