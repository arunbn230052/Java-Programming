import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> studentGrades = new TreeMap<>();
        studentGrades.put("S101", "A");
        studentGrades.put("S102", "B+");
        studentGrades.put("S103", "A-");
        studentGrades.put("S104", "B");
        studentGrades.put("S105", "C+");

        String studentId = "S102";
        if (studentGrades.containsKey(studentId)) {
            System.out.println("Grade for Student ID " + studentId + ": " + studentGrades.get(studentId));
        } else {
            System.out.println("Student ID not found.");
        }
        System.out.println("\nAll Student Grades (Sorted by Student ID):");
        for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + " => Grade: " + entry.getValue());
        }
        System.out.println("\nLowest Student ID: " + studentGrades.firstKey());
        System.out.println("Highest Student ID: " + studentGrades.lastKey());
    }
}

