package Exercises.C_Mankind;

public class Student extends Human {

    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    protected void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.length() < 5 || facultyNumber.length() > 10) {
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("First name: ").append(this.getFirstName()).append("\n");
        sb.append("Last name: ").append(this.getLastName()).append("\n");
        sb.append("Faculty number: ").append(this.facultyNumber).append("\n");

        return sb.toString();
    }
}
