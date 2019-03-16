package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q1;

public class AnimalMainClass
{
    public static void main(String[] args)
    {
        Animal[] aniArray = new Animal[10];

        Animal h1 = new Horse("Earle", "brown");
        Animal r1= new Rabbit("Rabby", "cream");
        Animal r2 = new Rabbit("Grey", "yellow");

        int num = 0;
        aniArray [num++] = h1;
        aniArray [num++] = r1;
        aniArray [num++] = r2;
    
        for(int i = 0; i < aniArray.length; i++)
        {
            if(aniArray[i] instanceof Horse){
                System.out.println(aniArray[i].toString());
                System.out.println();
            }
            if(aniArray[i] instanceof Rabbit){
                System.out.println(aniArray[i].toString());
                System.out.println();
            }
        }
    }
}
