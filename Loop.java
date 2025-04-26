import java.util.Scanner;

public class Loop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to display its multiplication table: ");
        int number = scanner.nextInt();

        int i = 1; 
        while (i <= 10) { 
            System.out.println(number + " x " + i + " = " + (number * i));
            i++; 
        }

        scanner.close();
    }
}



