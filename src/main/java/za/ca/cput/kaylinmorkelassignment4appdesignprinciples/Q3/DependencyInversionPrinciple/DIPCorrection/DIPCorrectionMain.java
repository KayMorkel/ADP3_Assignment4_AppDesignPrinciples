package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.DependencyInversionPrinciple.DIPCorrection;

public class DIPCorrectionMain
{
    public static void main(String[] args)
    {
        Animal ani = new Animal(new Kangaroo());
        Animal ani1 = new Animal(new Snake());

        System.out.println(ani.action());
        System.out.println(ani1.action());

    }
}
