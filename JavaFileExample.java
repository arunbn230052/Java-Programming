
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFileExample {
    public static void main(String[] args) {
        try {

            File fileObj = new File("C:\\Users\\HP\\OneDrive\\Desktop\\Java\\newTestFile.txt");

            if (fileObj.createNewFile()) {
                System.out.println("File created: " + fileObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter fileWriter = new FileWriter(fileObj);
            fileWriter.write("This is test\n");
            fileWriter.write("This is test\n");
            fileWriter.write("This is test\n");
            fileWriter.write("This is test\n");
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
