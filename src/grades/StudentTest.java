package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("John");
        student1.addGrade(90);
        student1.addGrade(85);
        student1.addGrade(95);
        System.out.println(student1.getName() + " has an average grade of " + student1.getGradeAverage());

        Student student2 = new Student("Jane");
        student2.addGrade(80);
        student2.addGrade(75);
        student2.addGrade(85);
        System.out.println(student2.getName() + " has an average grade of " + student2.getGradeAverage());

        Student student3 = new Student("Bob");
        student3.addGrade(70);
        student3.addGrade(65);
        student3.addGrade(80);
        System.out.println(student3.getName() + " has an average grade of " + student3.getGradeAverage());

        Student student4 = new Student("Alice");
        student4.addGrade(95);
        student4.addGrade(90);
        student4.addGrade(100);
        System.out.println(student4.getName() + " has an average grade of " + student4.getGradeAverage());

        Student student5 = new Student("Peter");
        student5.addGrade(85);
        student5.addGrade(75);
        student5.addGrade(80);
        System.out.println(student5.getName() + " has an average grade of " + student5.getGradeAverage());
    }
}
