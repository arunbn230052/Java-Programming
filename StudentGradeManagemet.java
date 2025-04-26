import java.io.FileWriter;
import java.io.IOException;

public class StudentGradeManagemet {
    public static void main(String[] args) {
       
        String studentName = "John";
        
    
        String subject1 = "Math";
        int mathPractical = 12;
        int mathTheory = 20;

        String subject2 = "Science";
        int sciencePractical = 15;
        int scienceTheory = 22;

        String subject3 = "Programming";
        int programmingPractical = 18;
        int programmingTheory = 25;

       
        String certificate = "Certificate of Achievement\n"
                + "Student Name: " + studentName + "\n\n"
                + "Subjects and Marks:\n"
                + subject1 + " - Practical: " + mathPractical + ", Theory: " + mathTheory + "\n"
                + subject2 + " - Practical: " + sciencePractical + ", Theory: " + scienceTheory + "\n"
                + subject3 + " - Practical: " + programmingPractical + ", Theory: " + programmingTheory + "\n";

      
        try {
            FileWriter writer = new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\Java\\" + studentName + "_Certificate.txt");
            writer.write(certificate);
            writer.close();
            System.out.println("Certificate created successfully for " + studentName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the certificate.");
            e.printStackTrace();
            
            
        }
    }
}
