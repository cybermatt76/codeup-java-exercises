package grades;

import java.util.*;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("John Doe");
        s1.addGrade(90);
        s1.addGrade(80);
        s1.addGrade(85);
        s1.recordAttendance("2022-04-18", "P");
        s1.recordAttendance("2022-04-19", "A");
        s1.recordAttendance("2022-04-20", "P");
        students.put("johndoe123", s1);

        Student s2 = new Student("Jane Smith");
        s2.addGrade(95);
        s2.addGrade(87);
        s2.addGrade(92);
        s2.recordAttendance("2022-04-18", "A");
        s2.recordAttendance("2022-04-19", "P");
        s2.recordAttendance("2022-04-20", "P");
        students.put("janesmith456", s2);

        Student s3 = new Student("Bob Johnson");
        s3.addGrade(78);
        s3.addGrade(85);
        s3.addGrade(90);
        s3.recordAttendance("2022-04-18", "P");
        s3.recordAttendance("2022-04-19", "P");
        s3.recordAttendance("2022-04-20", "P");
        students.put("bobjohnson789", s3);

        Student s4 = new Student("Sara Lee");
        s4.addGrade(88);
        s4.addGrade(91);
        s4.addGrade(82);
        s4.recordAttendance("2022-04-18", "A");
        s4.recordAttendance("2022-04-19", "A");
        s4.recordAttendance("2022-04-20", "P");
        students.put("saralee321", s4);

        printListOfStudents(students);
    }

    public static void printListOfStudents(HashMap<String, Student> students) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Welcome!\n");
            System.out.println("Here are the GitHub usernames of our students:\n");
            for (String username : students.keySet()) {
                System.out.println(username);
            }
            System.out.println("\nWhat student would you like to see more information on?");
            String userInput = scanner.nextLine();

            if (students.containsKey(userInput)) {
                Student student = students.get(userInput);
                System.out.printf("\nName: %s - GitHub Username: %s\n", student.getName(), userInput);
                System.out.printf("Current Average: %.2f\n", student.getGradeAverage());
                System.out.printf("Attendance Percentage: %.2f%%\n", student.calculateAttendancePercentage() * 100);
                List<String> absentDates = student.getAbsentDays();
                System.out.println("Absent Dates:");
                if (absentDates.isEmpty()) {
                    System.out.println("None");
                } else {
                    for (String date : absentDates) {
                        System.out.println(date);
                    }
                }
            } else {
                System.out.printf("Sorry, no student found with the GitHub username '%s'.\n", userInput);
            }

            // prompt the user to see the class average
            System.out.println("\nWould you like to see the classaverage? (y/n)");
            String seeClassAverage = scanner.nextLine();
            if (seeClassAverage.equalsIgnoreCase("y")) {
                double classAverage = calculateClassAverage(students);
                System.out.printf("\nClass average: %.2f\n", classAverage);
            }
            System.out.println("\nWould you like to see another student? (y/n)");
            String seeAnother = scanner.nextLine();
            if (!seeAnother.equalsIgnoreCase("y")) {
                keepRunning = false;
            }
        }

        System.out.println("Goodbye!");
    }

    public static double calculateClassAverage(HashMap<String, Student> students) {
        double classTotal = 0.0;
        int classSize = students.size();

        for (Student student : students.values()) {
            classTotal += student.getGradeAverage();
        }

        return classTotal / classSize;
    }
}
