package exception;

public class CourseNotFoundException extends Exception
{

    public CourseNotFoundException()
    {
        super("course not found!!");
    }
}