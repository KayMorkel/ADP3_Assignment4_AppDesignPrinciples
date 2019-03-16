package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.PrincipleOfLeastKnowledge.PLKCorrection;

public class PLKCorrectionMain
{
    public static void main(String[] args)
    {
        Toy toy = new Toy();
        toy.setType("Bone");
        Animal animal = new Animal();
        animal.setToy(toy);
        Person person = new Person("Merle", "Lukas", animal, toy);
        //person.setAnimal(animal);
        //person.setToy(toy);

        System.out.println("This owners dog owns a: "+ person.getToy());
    }

}
