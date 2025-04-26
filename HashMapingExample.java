import java.util.HashMap;
import java.util.Map;

public class HashMapingExample {
    public static void main(String[] args) {
        HashMap<String, String> studentGrades = new HashMap<>();
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
        System.out.println("\nAll Student Grades:");
        for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + " => Grade: " + entry.getValue());
        }
 
    }
}
