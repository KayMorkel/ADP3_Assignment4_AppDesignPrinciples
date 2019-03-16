package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.CompositeReusePrinciple.CRPCorrection;

public class CRPCorrectionMain
{
    public static void main(String[] args)
    {
        Horse hors1 = new Horse("Maynard", "Beige");
        System.out.println(hors1.toString() + "\n");

        Rabbit rab1 = new Rabbit("Alvin", "Brown");
        System.out.println(rab1.toString()+ "\n");
    }
}
