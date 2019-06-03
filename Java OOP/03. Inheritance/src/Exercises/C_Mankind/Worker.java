package Exercises.C_Mankind;

import java.text.DecimalFormat;

public class Worker extends Human {

    private Double weekSalary;
    private Double workHoursPerDay;

    public Worker(String firstName, String lastName, Double weekSalary, Double workHoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }

    private Double getWeekSalary() {
        return weekSalary;
    }

    private void setWeekSalary(Double weekSalary) {
        if (weekSalary < 10) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }

        this.weekSalary = weekSalary;
    }

    private Double getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    private void setWorkHoursPerDay(Double workHoursPerDay) {
        if (workHoursPerDay < 1 || workHoursPerDay > 12) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }

        this.workHoursPerDay = workHoursPerDay;
    }

    private Double getSalaryPerHour() {
        Double salaryPerHour = this.getWeekSalary() / this.getWorkHoursPerDay() / 7.0;

        return salaryPerHour;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        StringBuilder sb = new StringBuilder();

        sb.append("First name: ").append(this.getFirstName()).append("\n");
        sb.append("Last name: ").append(this.getLastName()).append("\n");
        sb.append("Week Salary: ").append(df.format(this.getWeekSalary())).append("\n");
        sb.append("Hours per day: ").append(df.format(this.getWorkHoursPerDay())).append("\n");
        sb.append("Salary per hour: ").append(df.format(this.getSalaryPerHour())).append("\n");

        return sb.toString();
    }
}
