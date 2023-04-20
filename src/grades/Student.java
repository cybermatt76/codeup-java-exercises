package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        if (grades.size() == 0) {
            return 0.0;
        }

        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    public void recordAttendance(String date, String value) {
        if (value.equalsIgnoreCase("A") || value.equalsIgnoreCase("P")) {
            attendance.put(date, value.toUpperCase());
        } else {
            System.out.println("Invalid attendance value. Use \"A\" for absent or \"P\" for present.");
        }
    }

    public double calculateAttendancePercentage() {
        if (attendance.size() == 0) {
            return 100.0;
        }

        double presentCount = 0;
        for (String value : attendance.values()) {
            if (value.equalsIgnoreCase("P")) {
                presentCount++;
            }
        }

        return (presentCount / attendance.size()) * 100;
    }

    public List<String> getAbsentDays() {
        List<String> absentDays = new ArrayList<>();

        for (HashMap.Entry<String, String> entry : attendance.entrySet()) {
            String date = entry.getKey();
            String value = entry.getValue();

            if (value.equalsIgnoreCase("A")) {
                absentDays.add(date);
            }
        }

        return absentDays;
    }
}


