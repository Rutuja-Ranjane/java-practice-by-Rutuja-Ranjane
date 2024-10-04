package challenges;

public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    // Constructor with all fields
    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    // Constructor with first name and last name only
    public Student(String firstName, String lastName) {
        this(firstName, lastName, 0, 0, 1); // Default values
    }

    // Constructor with registration number only
    public Student(int registration) {
        this("Unknown", "Unknown", registration, 0, 1); // Default values
    }

    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public boolean isApproved() {
        return grade >= 60;
    }

    public int changeYearIfApproved() {
        if (isApproved()) {
            year++;
            System.out.println("Congratulations");
        }
        return year;
    }
}
