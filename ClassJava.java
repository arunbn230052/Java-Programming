import java.util.Scanner;

public class ClassJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        if (gpa >= 3.5) {
            System.out.println("Eligibility for full scholarship");
        } else if (gpa >= 3.0 && gpa < 3.5) {
            System.out.println("Eligibility for partial scholarship");
        } else {
            System.out.println("Not eligible for scholarship");
        }

        scanner.close();
    }
}
