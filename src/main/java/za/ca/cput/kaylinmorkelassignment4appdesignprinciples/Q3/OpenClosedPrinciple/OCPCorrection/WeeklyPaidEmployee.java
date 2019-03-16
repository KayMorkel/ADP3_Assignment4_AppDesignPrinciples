package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.OpenClosedPrinciple.OCPCorrection;

public class WeeklyPaidEmployee implements Employee
{
    private String name;
    private String surname;
    private double ratePerWeek;

    public WeeklyPaidEmployee()
    {
        this.name = "";
        this.surname = "";
        this.ratePerWeek = 0.0;
    }

    public WeeklyPaidEmployee(String name, String surname, double ratePerWeek) {
        this.name = name;
        this.surname = surname;
        this.ratePerWeek = ratePerWeek;
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

    public double getRatePerWeek() {
        return ratePerWeek;
    }

    public void setRatePerWeek(double ratePerWeek) {
        this.ratePerWeek = ratePerWeek;
    }

    @Override //Overrided the common method from the interface
    public double calculateEmpSalary() {
        return ratePerWeek * 7;
    }
}
