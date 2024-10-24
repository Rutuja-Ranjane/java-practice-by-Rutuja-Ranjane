package challenges;

public class Main {
    public static void main(String[] args) {
        // Create some students
        Student student1 = new Student("Alice", "Smith", 101, 75, 1);
        Student student2 = new Student("Bob", "Johnson", 102, 55, 1);
        Student student3 = new Student("Charlie", "Brown", 103, 85, 1);

        // Create a course
        Course course = new Course("Mathematics", "Dr. Green", 2024);

        // Enroll individual students
        course.enroll(student1);
        course.enroll(student2);
        course.enroll(student3);

        // Enroll an array of students
        Student[] newStudents = {
            new Student("David", "Wilson", 104, 90, 1),
            new Student("Eva", "Davis", 105, 60, 1)
        };
        course.enroll(newStudents);

        // Print the full names of the enrolled students
        for (Student student : course.students) {
            student.printFullName();
        }

        // Show counts and grades
        System.out.println("Number of students enrolled: " + course.countStudents());
        System.out.println("Best grade in course: " + course.bestGrade());
        System.out.println("Average grade: " + course.averageGrade());

        // Show ranking
        System.out.println("Student rankings:");
        course.rankStudents();

        // Show above average
        course.showAboveAverage();
    }
}
