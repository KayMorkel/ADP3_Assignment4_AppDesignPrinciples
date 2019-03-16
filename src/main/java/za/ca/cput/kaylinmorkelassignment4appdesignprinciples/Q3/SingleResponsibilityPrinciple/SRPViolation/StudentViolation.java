package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.SingleResponsibilityPrinciple.SRPViolation;

import java.util.Random;

public class StudentViolation
{
    private String name;
    private String surname;
    private String studentNum;
    private String classGroup;

    public StudentViolation()
    {
        this.name = "";
        this.surname = "";
        this.studentNum = "";
        this.classGroup = "";
    }

    public StudentViolation(String name, String surname, String studentNum, String classGroup)
    {
        this.name = name;
        this.surname = surname;
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getClassGroup() {
        return classGroup;
    }
    public void setClassGroup(String classGroup) {
        this.classGroup = classGroup;
    }
    public String assignToAClassGroup() //This method should be in it's own class.
    {
        Random gen = new Random();

        int classGroup = gen.nextInt(3);

        String grp = "";
        if(classGroup == 0)
        {
            grp =  "3A";
            this.setClassGroup(grp);
        }
        else if(classGroup == 1)
        {
            grp = "3B";
            this.setClassGroup(grp);
        }
        else if(classGroup == 2)
        {
            grp = "3C";
            this.setClassGroup(grp);
        }
        return grp;
    }
}

