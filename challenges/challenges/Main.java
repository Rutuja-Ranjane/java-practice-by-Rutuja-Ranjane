package challenges;

public class Main {
    
    public static void main(String[] args) {
      
        list<Courses> clist = new ArrayList<>();
        Courses course = new Courses("DSA", "Bajaj sir", 2019);
        Courses course1 = new Courses("HTML", "Viresh sir", 2023);
        Courses course2 = new Courses("Java", "Ambika mam", 2024);
        Courses course3 = new Courses("BSM", "Pavitra mam", 2024);
        
        Student s1 = new Student("Rutuja", "Ranjane", 1, 81, 2018, course);
        Student s2 = new Student("abc", "Xyz", 2, 50, 2018, course);
        Student s3 = new Student("Shital", "R", 3, 82, 2018, course);
        Student s4 = new Student("Rushi", "R", 4, 90, 2018, course);

        course.enroll(s1);
        course.enroll(s2);
        course.enroll(s3);
        course.enroll(s4);

        Student s5 = new Student("Sahil", "Ghanwat", 1, 81, 2018, course1);
        Student s6 = new Student("", "Xyz", 2, 50, 2018, course1);
        Student s7 = new Student("Shital", "R", 3, 82, 2018, course1);
        Student s8 = new Student("Rushi", "R", 4, 90, 2018, course1);


   
        double averageGrade = course.getGradeAvg("DSA",course);       
        
        System.out.println("Average Grade for " + course.getCourseName() + ": " + averageGrade);
          
        course.printRanking();     
        course.checkIfAboveAverage("Coursename1", course);
    }
}
