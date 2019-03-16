package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.SingleResponsibilityPrinciple.SRPCorrection;

import java.util.Random;

public class Admin
{
    private int classGroup;

    public String assignToAClassGroup(StudentCorrection studCor)
    {
        Random gen = new Random();

        classGroup = gen.nextInt(3);

        String grp = "";
        if(classGroup == 0)
        {
            grp =  "3A";
            studCor.setClassGroup(grp);
        }
        else if(classGroup == 1)
        {
            grp = "3B";
            studCor.setClassGroup(grp);
        }
        else if(classGroup == 2)
        {
            grp = "3C";
            studCor.setClassGroup(grp);
        }
        return grp;
    }
}
