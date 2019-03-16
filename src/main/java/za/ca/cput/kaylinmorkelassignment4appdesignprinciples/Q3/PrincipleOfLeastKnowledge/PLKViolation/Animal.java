package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.PrincipleOfLeastKnowledge.PLKViolation;

public class Animal
{
    private String name;
    private Toy toy;

    public Animal(String name, Toy toy) {
        this.name = name;
        this.toy = toy;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Toy getToy() {
        return toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }
}
