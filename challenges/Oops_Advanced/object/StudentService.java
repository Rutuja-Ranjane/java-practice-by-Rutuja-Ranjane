package object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import exception.StudentNotFoundException;

public class StudentService
{
    StudentNotFoundException studentNotFoundException = new StudentNotFoundException();
    public HashMap<String, Course> courseList = new HashMap<>();
    public HashMap<String, Student> students = new HashMap<>();
    public HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();

    public StudentService()
    {
        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
    }

    public void enrollStudents( String courseName, String studentID )
    {
        Course course = courseList.get( courseName );

        if ( !coursesEnrolledByStudents.containsKey( studentID ) )
        {
            coursesEnrolledByStudents.put( studentID, new ArrayList<>() );
        }
        coursesEnrolledByStudents.get( studentID ).add( course );
    }

    public void unEnrollStudents( String courseName, String studentID ) throws StudentNotFoundException
    {
        Course course = courseList.get( courseName );

        if ( coursesEnrolledByStudents.containsKey( studentID ) )
        {
            coursesEnrolledByStudents.get( studentID ).remove( course );
        }
    }

    public void showEnrolledStudents(String courseName)
    {
        System.out.println("Students enrolled in " + courseName);
        // Student student = students.get(studentId);
        // System.out.println("student id= "+ student.getId() + " student name=" + student.getName());
        for (String studentId : coursesEnrolledByStudents.keySet()) {
            List<Course> enrolledCourses = coursesEnrolledByStudents.get(studentId);
            if (enrolledCourses != null) {
                Student student = students.get(studentId);
                if (student != null) {
                    System.out.println("Student ID: " + student.getId() + ", Name: " + student.getName());
                }
            }
        }

    }

    public void showAllCourses()
    {
        
        //TODO implement using collections loops
        System.out.println("All available courses:");
        for (Course course : courseList.values()) {
            System.out.println("Course name = "+course.getName());
            System.out.println(" Instructor = "  + course.getProfessorName());
        }
    }
}
