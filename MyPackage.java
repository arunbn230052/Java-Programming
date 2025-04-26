public class MyPackage {
    public static void main(String[] args) {


        String greeting = "Hello, World!";
        System.out.println("Original String: " + greeting);

        String name = "Alice";
        String fullGreeting = greeting + " My name is " + name + ".";
        System.out.println("Concatenated String: " + fullGreeting);

        int length = greeting.length();
        System.out.println("Length of the string: " + length);

        String subStr = greeting.substring(7, 12); // Extracts "World"
        System.out.println("Substring: " + subStr);

        String str1 = "hello";
        String str2 = "Hello";
        boolean isEqual = str1.equals(str2);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("Strings are equal: " + isEqual);
        System.out.println("Strings are equal ignoring case: " + isEqualIgnoreCase);

        String upper = greeting.toUpperCase();
        String lower = greeting.toLowerCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}


