package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.OpenClosedPrinciple.OCPViolation;

public class SalaryCalc
{
    public double calculateHourlyEmpSalary(HourlyPaidEmployee hpe)
    {
        return hpe.getRatePerHour() * hpe.getNumWorkingHours();
    }
    public double calculateWeeklyEmpSalary(WeeklyPaidEmployee wpe)
    {
        return wpe.getRatePerWeek() * 7;
    }
}
