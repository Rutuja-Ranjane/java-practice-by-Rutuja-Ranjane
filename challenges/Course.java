package challenges;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    String professorName;
    int year;
    List<Student> students;

    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.students = new ArrayList<>();
    }

    public void enroll(Student student) {
        students.add(student);
    }

    public void unEnroll(Student student) {
        students.removeIf(s -> s.registration == student.registration);
    }

    public int countStudents() {
        return students.size();
    }

    public int bestGrade() {
        int best = 0;
        for (Student student : students) {
            if (student.grade > best) {
                best = student.grade;
            }
        }
        return best;
    }

    // Overloaded method to enroll an array of students
    public void enroll(Student[] studentsArray) {
        for (Student student : studentsArray) {
            enroll(student);
        }
    }

    // Calculate average grade for the course
    public double averageGrade() {
        if (students.isEmpty()) return 0;
        int total = 0;
        for (Student student : students) {
            total += student.grade;
        }
        return (double) total / students.size();
    }

    // Output ranking of students by grade
    public void rankStudents() {
        students.sort((s1, s2) -> Integer.compare(s2.grade, s1.grade)); // Sort in descending order
        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName + ": " + student.grade);
        }
    }

    // Show if each student is above average
    public void showAboveAverage() {
        double avg = averageGrade();
        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName + " is " + (student.grade > avg ? "above" : "below") + " average.");
        }
    }
}
