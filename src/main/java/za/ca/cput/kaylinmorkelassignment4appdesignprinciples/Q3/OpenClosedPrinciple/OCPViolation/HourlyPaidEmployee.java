package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.OpenClosedPrinciple.OCPViolation;

public class HourlyPaidEmployee
{
    private String name;
    private String surname;
    private double ratePerHour;
    private int numWorkingHours;


    public HourlyPaidEmployee()
    {
        this.name = "";
        this.surname = "";
        this.ratePerHour = 0.0;
        this.numWorkingHours = 0;
    }

    public HourlyPaidEmployee(String name, String surname, double ratePerHour, int numWorkingHours) {
        this.name = name;
        this.surname = surname;
        this.ratePerHour = ratePerHour;
        this.numWorkingHours = numWorkingHours;
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

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public int getNumWorkingHours() {
        return numWorkingHours;
    }

    public void setNumWorkingHours(int numWorkingHours) {
        this.numWorkingHours = numWorkingHours;
    }
}
