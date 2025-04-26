public class JavaNewForLoop {
    public static void main(String[] args) {
        // while loop: 1 to 100
        int i = 1; // Declare and initialize 'i' before using it
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        // for loop: 1 to 9
        for (int j = 1; j < 10; j++) { // Use a different variable (j) to avoid conflicts
            System.out.println(j);
        }

        // 5 fact = 1*2*3*

       int givenNumber =5;
       int fact=1;
       for(int i=1; i<=givenNumber; i++){
        fact *=i;
       }
       System.out.println(fact);
       // nested for loop
       for(int i=1; i<=5;i++){
        for(int j=1; j<=i; j++){
            System.out.println(i+ " ")
        }
        System.out.println("")
       }
    }
}
