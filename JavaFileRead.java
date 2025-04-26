import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaFileRead {
    public static void main(String[] args) {
        File fileObj = new File("C:\\Users\\HP\\OneDrive\\Desktop\\Java\\newTestFile.txt");

        try {
            Scanner scanner = new Scanner(fileObj);


            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                System.out.println(text); 
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            return; // Exit early if file isn't found
        }

        if (fileObj.delete()) {
            System.out.println("Deleted file: " + fileObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
