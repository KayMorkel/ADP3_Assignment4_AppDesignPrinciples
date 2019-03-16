package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.LiskovSubstitutionPrinciple.LSPViolation;

public class Employee
{
    private String name;
    private String surname;
    private String empId;

    public Employee()
    {
        this.name = "";
        this.surname = "";
        this.empId = "";
    }

    public Employee(String name, String surname, String empId)
    {
        this.name = name;
        this.surname = surname;
        this.empId = empId;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getSurname()
    {
        return surname;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public String getEmpId()
    {
        return empId;
    }
    public void setEmpId(String empId)
    {
        this.empId = empId;
    }
    public double empSalaryCalc(double rate, int paymentPeriod)
    {
        return rate * paymentPeriod;
    }
}
