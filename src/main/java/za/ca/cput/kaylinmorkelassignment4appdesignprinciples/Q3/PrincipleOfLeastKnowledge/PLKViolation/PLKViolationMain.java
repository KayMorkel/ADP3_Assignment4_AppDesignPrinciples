package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.PrincipleOfLeastKnowledge.PLKViolation;

public class PLKViolationMain
{
    public static void main(String[] args)
    {
        Toy toy = new Toy();
        toy.setType("Bone");
        Animal animal = new Animal();
        animal.setToy(toy);
        Person person = new Person();
        person.setAnimal(animal);

        //Display the persons pet's toy
        System.out.println(person.getAnimal().getToy()); //Violation of Principle of least knowledge
    }

}
