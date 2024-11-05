public class App
{
    public static void main( String[] args )
    {
        CourseService courseService = new CourseService();

        String courseId = "math_01";
        String studentId = "120120";
        System.out.println("information of course is");
        courseService.displayCourseInformation( courseId );
        System.out.println("information of student are");
        courseService.displayStudentInformation( studentId);

        courseService.enrollStudent( studentId, courseId );
        System.out.println("after enrolling students are");
        courseService.displayStudentInformation( studentId);

        courseService.unEnrollStudent( studentId, courseId );
        System.out.println("after unenrolling students are");
        courseService.displayStudentInformation( studentId);

    }

}