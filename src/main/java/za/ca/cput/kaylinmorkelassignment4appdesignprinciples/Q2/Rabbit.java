package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q2;

public class Rabbit implements AnimalsDetails
{
    private String action;
    private House house;
    private String name;
    private String colour;

    public Rabbit(String name, String colour)
    {
        this.name = name;
        this.colour = colour;
        this.house = new House();
        house.setHouseType("Burrow");
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getColour() {
        return colour;
    }
    @Override
    public String action()
    {
        action = "A rabbit hops and squeaks";
        return action;
    }
    public String getHouse()
    {
        return house.getHouseType();
    }
    public String toString()
    {

        return "Name: " + name + "\nColour: " + colour + "\nHouse type for a Rabbit: " + this.getHouse() + "\nActions: " + action();
    }
}
