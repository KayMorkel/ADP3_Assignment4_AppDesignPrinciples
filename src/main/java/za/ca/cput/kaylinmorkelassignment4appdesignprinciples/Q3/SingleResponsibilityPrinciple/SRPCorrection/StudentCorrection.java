package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.SingleResponsibilityPrinciple.SRPCorrection;

import java.util.Random;

public class StudentCorrection
{
    private String name;
    private String surname;
    private String studentNum;
    private String classGroup;

    public StudentCorrection()
    {
        this.name = "";
        this.surname = "";
        this.studentNum = "";
        this.classGroup = "";
    }

    public StudentCorrection(String name, String surname, String studentNum, String classGroup)
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
}


